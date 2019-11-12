package com.cobelliluetichperezvazquez.trabajointegrador.gestores;
import java.util.Calendar;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOMedidasDeSeguridad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;
import org.springframework.beans.factory.annotation.Autowired;

public class GestorPoliza {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;
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


    boolean encontrarPoliza(String patente, String motor, String chasis){
       return (gestorBaseDeDatos.findPoliza(patente, motor, chasis));
    }
    DTOPoliza darDeAltaPoliza(DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, List<DTOHijo> dtoHijos) {
        //TODO CU17 3.
        Cliente cliente = gestorBaseDeDatos.findClienteById(dtoPoliza.getidCliente());

        //TODO !! Mostrar datos del cliente

        //Validaciones de datos (falta todo mostrar en pantalla):
        //Ver el tema del int↓
        if (dtoPoliza.getIdLocalidad() == null || dtoPoliza.getDomicilio() == null || dtoPoliza.getIdModelo() == null || dtoPoliza.getIdMarca() == null || dtoPoliza.getAñoVehiculo() == null || dtoPoliza.getMotorVehiculo() == null || dtoPoliza.getChasisVehiculo() == null || dtoPoliza.getKilometrosPorAño() == null) {
            System.out.printl("Por favor, ingresar todos los datos requeridos.");
            //Vuelve a completar datos
        }

        boolean i = true;
        int cont = 0;
        while (i && dtoHijos.get(cont) != null) {
            if (this.estaEnRangoEdad(dtoHijos.get(cont).getFechaNacimiento()))
                i = false;
            cont++;
        }
        if (!i) System.out.println("Ingresó un hijo con edad fuera de rango."); //Vuelve a compeltar datos

        if (this.encontrarPoliza(dtoPoliza.getPatente(), dtoPoliza.getMotorVehiculo(), dtoPoliza.getChasisVehiculo())) {
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
        if (dtoCobertura.getFechaInicio().before(fechaAyer) || dtoCobertura.getFechaInicio().after(fechaAMasUnMes)) {
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
            poliza.setChasisVehiculo(dtoPoliza.setChasisVehiculo());
            poliza.setSumaAsegurada(dtoPoliza.getSumaAsegurada());
            poliza.setPatente(dtoPoliza.getPatente());
            poliza.setKilometrosPorAño(dtoPoliza.getKilometrosPorAño());
            poliza.setFormaDePago(dtoPoliza.getFormaDePago());
            poliza.setAñoVehiculo(dtoPoliza.getAñoVehiculo());
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
            poliza.setDescuentos(dtoPoliza.getImportesporDescuentos());

            poliza.setHijos(dtoHijos); //hay que encontrar los hijos de cada dto y asociarle esas intancias
        }
    }

        //TODO opcion de que el actor, dsps de todo, seleccione otra cobertura y vuelva al paso 7

    public static boolean estaEnRangoEdad(Calendar fechaNacimiento) {
        boolean check = false;
        Calendar fechaMenor = Calendar.getInstance();
        Calendar fechaMayor = Calendar.getInstance();
        fechaMenor.add(Calendar.YEAR, -18);
        fechaMayor.add(Calendar.YEAR, -30);
        if(fechaNacimiento.before(fechaMayor) || fechaNacimiento.after(fechaMenor)) check = false;
        return check;
    }
}