package com.cobelliluetichperezvazquez.trabajointegrador.model.DTO;

import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.CondicionIVA;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;

public class DTOCliente {
	int idCliente;
	String apellido;
	String nombre;
	TipoDeDocumento tipoDeDocumento;
	String numeroDeDocumento;
	String CUIL;
	Sexo sexo;
	Date fechaDeNacimiento; 
	CondicionIVA condicionIVA;
	String correoElectronico;
	EstadoCivil estadoCivil;
	String profesion;
	int añoDeRegistro;
	

}
