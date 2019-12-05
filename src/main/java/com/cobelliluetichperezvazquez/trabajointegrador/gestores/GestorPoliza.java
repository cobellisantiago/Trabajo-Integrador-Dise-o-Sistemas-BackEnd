package com.cobelliluetichperezvazquez.trabajointegrador.gestores;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOCliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOMedidasDeSeguridad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorPoliza {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;
    @Autowired
    private GestorCliente gestorCliente;
    @Autowired
    private GestorCobertura gestorCobertura;
    @Autowired
    private GestorModelo gestorModelo;
    @Autowired
    private GestorPremio gestorPremio;
    @Autowired
    private GestorMedidasDeSeguridad gestorMedidasDeSeguridad;
    @Autowired
    private GestorLocalidad gestorLocalidad;
    @Autowired
    private GestorHijos gestorHijos;
    @Autowired
    private GestorCuotas gestorCuotas;

    public Poliza darDeAltaPoliza(DTOPoliza dtoPoliza, List<DTOHijo> dtoHijos) {
        //TODO  manejar esto para que desde el front se sepa de este error

        //6.A
        if(dtoPoliza.getIdLocalidad() == null) throw new NullPointerException("Id localidad null");
        //if(dtoPoliza.getIdProvincia() == null) throw new NullPointerException("Id provincia null");
        if(dtoPoliza.getIdModelo() == null) throw new NullPointerException("Id modelo null");
        //if(dtoPoliza.getIdMarca() == null) throw new NullPointerException("Id marca null");
        if(dtoPoliza.getAnioFabricacion() == null) throw new NullPointerException("Id año null");
        if(dtoPoliza.getMotorVehiculo() == null) throw new NullPointerException("Motor vehiculo null");
        if(dtoPoliza.getChasisVehiculo() == null) throw new NullPointerException("Chasis vehiculo null");
        if(dtoPoliza.getKilometrosPorAño() == -1) throw new NullPointerException("kilometro por año null");

        //6.B
        boolean i = true;
        int cont = 0;
        while (i && dtoHijos.get(cont) != null) {
            if (estaEnRangoEdad(dtoHijos.get(cont).getFechaDeNacimiento()))
                i = false;
            cont++;
        }
        if (!i) throw new NullPointerException("Ingresó un hijo con edad fuera de rango."); //Vuelve a compeltar datos

        //6.C
        if (gestorBaseDeDatos.findPoliza(dtoPoliza.getPatente(), dtoPoliza.getMotorVehiculo(), dtoPoliza.getChasisVehiculo())) {
            throw new NullPointerException("Ya existe una póliza vigente para los datos ingresados.");
        }

        //Mostrar los tipos de cobertura correctos
        AñoFabricacion anioFabricacion = gestorModelo.obtenerAnioFabricacion(dtoPoliza.getAnioFabricacion());
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.YEAR,-10);
        if(fecha.before(anioFabricacion.getAño()) && dtoPoliza.getIdCobertura()==0) {
            throw new NullPointerException("la cobertura no es valida");
        }

        //9.A
        Calendar fechaAyer = Calendar.getInstance();
        Calendar fechaAMasUnMes = Calendar.getInstance();
        fechaAMasUnMes.add(Calendar.MONTH, +1);
        fechaAyer.add(Calendar.DATE, -1);
        Poliza poliza = new Poliza();
        if (dtoPoliza.getFechaInicioVigencia().before(fechaAyer) || dtoPoliza.getFechaInicioVigencia().after(fechaAMasUnMes)) {
            System.out.println("Por favor, seleccione otra fecha de inicio.");
        }

        //Una vez que se hicieron las validaciones, empiezo a buscar instancias o crearlas
        Cliente cliente = gestorCliente.obtener(dtoPoliza.getIdCliente());
        poliza.setCliente(cliente);
        Localidad localidad = gestorLocalidad.encontrarLocalidad(dtoPoliza.getIdLocalidad());
        poliza.setIdLocalidad(localidad);
        Modelo modelo = gestorModelo.encontrarModelo(dtoPoliza.getIdModelo());
        poliza.setModelo(modelo);
        poliza.setAnioFabricacion(anioFabricacion.getAño()); //ya se habia buscado en la cobertura
        poliza.setSumaAsegurada(anioFabricacion.getsumaAsegurada());
        poliza.setMotorVehiculo(dtoPoliza.getMotorVehiculo());
        poliza.setChasisVehiculo(dtoPoliza.getChasisVehiculo());
        poliza.setPatente(dtoPoliza.getPatente());
        poliza.setKilometrosPorAño(dtoPoliza.getKilometrosPorAño());
        MedidasDeSeguridad medidasDeSeguridad = gestorMedidasDeSeguridad.encontrarMedidaDeSeguridad(dtoPoliza.getIdMedidasDeSeguridad());
        poliza.setMedidasDeSeguridad(medidasDeSeguridad);
        poliza.setNumeroDeSiniestros(dtoPoliza.getNumeroSiniestrosUltimoAño());
        String numeroDePoliza = generarNumeroDePoliza();
        poliza.setNumeroDePoliza(numeroDePoliza);
        List<Hijo> hijos = gestorHijos.crearHijos(dtoHijos, poliza);
        poliza.setHijos(hijos);

        //ver calculo de premios y demas

        Cobertura cobertura = gestorCobertura.encontrarCobertura(dtoPoliza.getIdCobertura());
        poliza.setCobertura(cobertura);
        poliza.setFechaInicioVigencia(dtoPoliza.getFechaInicioVigencia());
        poliza.setFechaFinVigencia(dtoPoliza.getFechaFinVigencia());
        poliza.setFechaDeEmision(Calendar.getInstance());
        poliza.setFormaDePago(dtoPoliza.getFormaDePago());
        if(poliza.getFormaDePago().equals(FormaDePago.MENSUAL)) {
            for(int j=1; j<7; j++) {
                Cuota cuota = gestorCuotas.crearCuota(j, poliza);
            }
        }
        else {
            Cuota cuota = gestorCuotas.crearCuota(1, poliza);
        }
        poliza.setEstado(EstadoPoliza.GENERADA);
        List<Poliza> polizas = gestorBaseDeDatos.findAllPolizaByCliente(cliente.getIdCliente());

        boolean algunaVigente = false;
        boolean poseeCuotaImpaga = false;
        if (polizas!=null) { //si el cliente ya tenia asociada polizas
            for(Poliza p : polizas) {
                if(p.getEstado().equals(EstadoPoliza.GENERADA))
                    algunaVigente = true;
                List<Cuota> cuotas = gestorCuotas.buscarCuotasVigentes(p.getNumeroDePoliza());
                for(Cuota c : cuotas) {
                    if(c.getPago()==null)
                        poseeCuotaImpaga=true;
                }
            }
        }
        if(polizas==null || !algunaVigente || poseeCuotaImpaga ||
          !cliente.getNumeroSiniestrosUltimoAño().equals(NumeroDeSiniestros.NINGUNO)) {
            cliente.setEstado(EstadoCliente.NORMAL_AL_DIA);
        }
        return  poliza;
    }

    public boolean encontrarPolizaVigente(String patente, String motor, String chasis) {
        return (gestorBaseDeDatos.findPoliza(patente, motor, chasis));
    }

    //TODO opcion de que el actor, dsps de todo, seleccione otra cobertura y vuelva al paso 7

    private static boolean estaEnRangoEdad(Calendar fechaNacimiento) {
        boolean check = true;
        Calendar fechaMenor = Calendar.getInstance();
        Calendar fechaMayor = Calendar.getInstance();
        fechaMenor.add(Calendar.YEAR, -18);
        fechaMayor.add(Calendar.YEAR, -30);
        if(fechaNacimiento.before(fechaMayor) || fechaNacimiento.after(fechaMenor)) check = false;
        return check;
    }

    public Poliza buscar(String numeroDePoliza) {
        return gestorBaseDeDatos.findPolizaById(numeroDePoliza);
    }

    private String generarNumeroDePoliza () {
        String numeroDePoliza = new String();
        do {
            int sucursal = (int) (Math.random());
            if (sucursal == 0) numeroDePoliza = "4631-";
            else numeroDePoliza = "3689-";

            int solicitudPoliza = (int) (Math.random()*9999999);
            numeroDePoliza += solicitudPoliza+"-00";
        } while(buscar(numeroDePoliza)!=null);
        return numeroDePoliza;
    }
}