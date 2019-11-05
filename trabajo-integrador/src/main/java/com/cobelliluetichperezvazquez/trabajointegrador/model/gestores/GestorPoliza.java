package com.cobelliluetichperezvazquez.trabajointegrador.model.gestores;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Poliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.DTO.DTOPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;

public class GestorPoliza {

	DTOPoliza darDeAltaPoliza(DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, ArrayList<DTOHijo> dtoHijos){ 
		//Falta agregar estos parámetros al diagrama
		
		Cliente c = new Cliente(444, "Gonzalez", "Juan", TipoDeDocumento.LE_DNI, "16350457"); //falta crear new Cliente
		
		//Falta CU17 3. 
		
		//Mostrar datos del cliente 
		//TODO validar datos
		
		if(dtoPoliza.getIdLocalidad()==null || dtoPoliza.getDomicilio()==null || dtoPoliza.getIdModelo()==null ||  dtoPoliza.getIdMarca()==null || dtoPoliza.getAñoVehiculo()==null || dtoPoliza.getMotorVehiculo()==null || dtoPoliza.getChasisVehiculo()==null || dtoPoliza.getKilometrosPorAño()==null) {
			printf("Por favor ingresar todos los datos requeridos.");	
		}
		
		boolean i= true; 
		
		int cont= 0;
		while(i) {
			if (this.calcularEdad(dtoHijos.get(cont).getFechaNacimiento())<18 || this.calcularEdad(dtoHijos.get(cont).getFechaNacimiento())>30)
				i=false;
			cont++;
		}
		if(!i) printf("Ingreso un hijo con edad fuera de rango.");
		
		if(GestorBaseDeDatos.buscarPoliza(dtoPoliza.getPatente(), dtoPoliza.getMotorVehiculo(), dtoPoliza.getChasisVehiculo()) != null) {
			printf("Ya existe una póliza vigente para los datos ingresados.");
		}
		
		if() {
			
		}
		
		
		Poliza p = new Poliza();
		
		
		
		
		
		
	}
	
	public static int calcularEdad(Date fechaNac) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("Tu edad es: %s años, %s meses y %s días",
		                    periodo.getYears(), periodo.getMonths(), periodo.getDays());

		
		
		
		}
	
}
