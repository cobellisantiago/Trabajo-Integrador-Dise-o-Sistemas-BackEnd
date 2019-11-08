package com.cobelliluetichperezvazquez.trabajointegrador.gestores;
import java.util.Calendar;
import java.util.List;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Cliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOMedidasDeSeguridad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Poliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;

public class GestorPoliza {
//    DTOPoliza darDeAltaPoliza(DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, List<DTOHijo> dtoHijos){
//        //TODO Agregar estos parámetros al diagrama
//        //TODO CU17 3.
//
//        Cliente c = new Cliente(444, "Gonzalez", "Juan", TipoDeDocumento.LE_DNI, "16350457"); //falta crear new Cliente
//        //TODO !! Mostrar datos del cliente
//
//        //Validaciones de datos (falta todo mostrar en pantalla):
//        if(dtoPoliza.getIdLocalidad()==null || dtoPoliza.getDomicilio()==null || dtoPoliza.getIdModelo()==null ||  dtoPoliza.getIdMarca()==null || dtoPoliza.getAñoVehiculo()==null || dtoPoliza.getMotorVehiculo()==null || dtoPoliza.getChasisVehiculo()==null || dtoPoliza.getKilometrosPorAño()==null) {
//            System.out.printl("Por favor, ingresar todos los datos requeridos.");
//            //Vuelve a completar datos
//        }
//
//        boolean i= true;   int cont= 0;
//        while(i && dtoHijos.get(cont)!=null) {
//            if (this.estaEnRangoEdad(dtoHijos.get(cont).getFechaNacimiento()))
//                i=false;
//            cont++;
//        } if(!i) System.out.println("Ingresó un hijo con edad fuera de rango."); //Vuelve a compeltar datos
//
//        if(GestorBaseDeDatos.buscarPoliza(dtoPoliza.getPatente(), dtoPoliza.getMotorVehiculo(), dtoPoliza.getChasisVehiculo()) != null) {
//            //TODO hacer el método de arriba, de buscar póliza para esos datos específicos
//            System.out.println("Ya existe una póliza vigente para los datos ingresados.");
//            //Vuelve a completar datos
//        }
//
//        //Se aceptan esos↑ datos y el actor elige un tipo de cobertura
//        //TODO Agarra DTO cobertura?? god knows how
//
//        Calendar fechaAyer = Calendar.getInstance();
//        Calendar fechaAMasUnMes = Calendar.getInstance();
//        fechaAMasUnMes.add(Calendar.MONTH, +1);
//        fechaAyer.add(Calendar.DATE, -1);
//        //TODO tomar las fechas con Calendar no Date
//        if(dtoCobertura.getFechaInicio()<fechaAyer || dtoCobertura.getFechaInicio()>fechaAMasUnMes ) {
//            System.out.println("Por favor, seleccione otra fecha de inicio.");
//            //Vuelve a completar datos
//        }
//
//        Poliza p = new Poliza();
//
//        //TODO opcion de que el actor, dsps de todo, seleccione otra cobertura y vuelva al paso 7
//    }
//
//    public static boolean estaEnRangoEdad(Calendar fechaNacimiento) {
//        boolean check = false;
//        Calendar fechaMenor = Calendar.getInstance();
//        Calendar fechaMayor = Calendar.getInstance();
//        fechaMenor.add(Calendar.YEAR, -18);
//        fechaMayor.add(Calendar.YEAR, -30);
//        if(fechaNacimiento.before(fechaMayor) || fechaNacimiento.after(fechaMenor)) check = false;
//        Return check;
////        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
////        //LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
////        LocalDate ahora = LocalDate.now();
////
////        Period periodo = Period.between(fechaNac, ahora);
////        System.out.printf("Tu edad es: %s años, %s meses y %s días",
////                periodo.getYears(), periodo.getMonths(), periodo.getDays());
//    }


}