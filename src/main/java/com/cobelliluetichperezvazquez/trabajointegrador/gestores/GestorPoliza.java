package com.cobelliluetichperezvazquez.trabajointegrador.gestores;
import java.util.Calendar;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOCliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOMedidasDeSeguridad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
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

    public boolean encontrarPolizaVigente(String patente, String motor, String chasis) {
       return (gestorBaseDeDatos.findPoliza(patente, motor, chasis));
    }

    public Poliza darDeAltaPoliza(DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, List<DTOHijo> dtoHijos) {

        //TODO CU17 3
        Cliente cliente = gestorCliente.obtener(dtoPoliza.getIdCliente());

        //TODO !! Mostrar datos del cliente

        //Validaciones de datos (falta mostrar en pantalla):

        //TODO  manejar esto para que desde el front se sepa de este error
        if(dtoPoliza.getIdLocalidad() == null) throw new NullPointerException("Id localidad null");
        if(dtoPoliza.getIdProvincia() == null) throw new NullPointerException("Id provincia null");
        if(dtoPoliza.getIdModelo() == null) throw new NullPointerException("Id modelo null");
        if(dtoPoliza.getIdMarca() == null) throw new NullPointerException("Id marca null");
        if(dtoPoliza.getIdAñoVehiculo() == null) throw new NullPointerException("Id año null");
        if(dtoPoliza.getMotorVehiculo() == null) throw new NullPointerException("Motor vehiculo null");
        if(dtoPoliza.getChasisVehiculo() == null) throw new NullPointerException("Chasis vehiculo null");
        if(dtoPoliza.getKilometrosPorAño() == -1) throw new NullPointerException("kilometro por año null");

        boolean i = true;
        int cont = 0;
        while (i && dtoHijos.get(cont) != null) {
            if (estaEnRangoEdad(dtoHijos.get(cont).getFechaDeNacimiento()))
                i = false;
            cont++;
        }
        if (!i) throw new NullPointerException("Ingresó un hijo con edad fuera de rango."); //Vuelve a compeltar datos
        else {
            List<Integer> idHijos = gestorHijos.crear(dtoHijos);
            //ver como asociar los hijos a la poliza en la tabla poliza_hijos
        }

        if (this.encontrarPolizaVigente(dtoPoliza.getPatente(), dtoPoliza.getMotorVehiculo(), dtoPoliza.getChasisVehiculo())) {
            System.out.println("Ya existe una póliza vigente para los datos ingresados.");
            //Vuelve a completar datos
        }

        //Se aceptan esos↑ datos y el actor elige un tipo de cobertura
        //TODO Agarra DTO cobertura?? god knows how

        Poliza poliza = new Poliza();

        Calendar fechaAyer = Calendar.getInstance();
        Calendar fechaAMasUnMes = Calendar.getInstance();
        fechaAMasUnMes.add(Calendar.MONTH, +1);
        fechaAyer.add(Calendar.DATE, -1);
        //TODO tomar las fechas con Calendar no Date
        if (dtoPoliza.getFechaInicioVigencia().before(fechaAyer) || dtoPoliza.getFechaInicioVigencia().after(fechaAMasUnMes)) {
            System.out.println("Por favor, seleccione otra fecha de inicio.");
            //Vuelve a completar datos
        }else{
            Cobertura cobertura = gestorCobertura.encontrarCobertura(dtoPoliza.getIdCobertura());
            //TODO crear nro de póliza
            poliza.setCobertura(cobertura);
            poliza.setFechaInicioVigencia(dtoPoliza.getFechaInicioVigencia());
            poliza.setFechaFinVigencia(dtoPoliza.getFechaFinVigencia());
            poliza.setFechaDeEmision(Calendar.getInstance());
            poliza.setMotorVehiculo(dtoPoliza.getMotorVehiculo());
            poliza.setChasisVehiculo(dtoPoliza.getChasisVehiculo());
            poliza.setSumaAsegurada(dtoPoliza.getSumaAsegurada());
            poliza.setPatente(dtoPoliza.getPatente());
            poliza.setKilometrosPorAño(dtoPoliza.getKilometrosPorAño());
            poliza.setFormaDePago(dtoPoliza.getFormaDePago());
            //TODO Deberia buscar la clase en la base de datos
            poliza.setAñoVehiculo(dtoPoliza.getIdAñoVehiculo());
            poliza.setEstado(EstadoPoliza.GENERADA);
            poliza.setCliente(cliente);
            Modelo modelo = gestorModelo.encontrarModelo(dtoPoliza.getIdModelo());
            Localidad domicilioRiesgo = gestorLocalidad.encontrarLocalidad(dtoPoliza.getIdLocalidad());
            Premio premio = gestorPremio.crearPremio(dtoPoliza.getIdPremio()); //Ver cómo crear
            MedidasDeSeguridad medidasDeSeguridad = gestorMedidasDeSeguridad.crearMedidasDeSeguridad(1, dtoMedidasDeSeguridad.isAlarma(), dtoMedidasDeSeguridad.isSeGuardaEnGarage(), dtoMedidasDeSeguridad.isRastreo(), dtoMedidasDeSeguridad.isTuercasAntirrobo());

            //falta ver como generar el nro ↓
            poliza.setMedidasDeSeguridad(medidasDeSeguridad);
            poliza.setModelo(modelo);
            poliza.setPremio(premio);
            poliza.setDomicilioDeRiesgo(domicilioRiesgo);

            //TODO esto se calcula desde aca....
            //poliza.setDescuentos(dtoPoliza.getImportesporDescuentos());

           // poliza.setHijos(dtoHijos); //hay que encontrar los hijos de cada dto y asociarle esas intancias
        }

        return  poliza;
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
}