package com.cobelliluetichperezvazquez.trabajointegrador.model.DTO;



import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;

public class DTOPoliza {
	int idLocalidad;
	int idProvincia;
	int idMarca;
	int idModelo;
	String motorVehiculo;
	String chasisVehiculo;
	String patente;
	Date fechaInicioVigencia;
	Date fechaFinVigencia;
	float sumaAsegurada;
	float totalPremio;
	float importesporDescuentos;
	float montoTotalAbonar;
	int añoVehiculo;
	int kilometrosPorAño;
  //NumeroDeSiniestros numeroSiniestrosUltimoAño; 
	int idCobertura;
	FormaDePago formaDePago;
	String numeroDePoliza;
	EstadoPoliza estado;
	String numeroDeSolicitud;
	
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public int getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	public String getMotorVehiculo() {
		return motorVehiculo;
	}
	public void setMotorVehiculo(String motorVehiculo) {
		this.motorVehiculo = motorVehiculo;
	}
	public String getChasisVehiculo() {
		return chasisVehiculo;
	}
	public void setChasisVehiculo(String chasisVehiculo) {
		this.chasisVehiculo = chasisVehiculo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Date getFechaInicioVigencia() {
		return fechaInicioVigencia;
	}
	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}
	public Date getFechaFinVigencia() {
		return fechaFinVigencia;
	}
	public void setFechaFinVigencia(Date fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}
	public float getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public float getTotalPremio() {
		return totalPremio;
	}
	public void setTotalPremio(float totalPremio) {
		this.totalPremio = totalPremio;
	}
	public float getImportesporDescuentos() {
		return importesporDescuentos;
	}
	public void setImportesporDescuentos(float importesporDescuentos) {
		this.importesporDescuentos = importesporDescuentos;
	}
	public float getMontoTotalAbonar() {
		return montoTotalAbonar;
	}
	public void setMontoTotalAbonar(float montoTotalAbonar) {
		this.montoTotalAbonar = montoTotalAbonar;
	}
	public int getAñoVehiculo() {
		return añoVehiculo;
	}
	public void setAñoVehiculo(int añoVehiculo) {
		this.añoVehiculo = añoVehiculo;
	}
	public int getKilometrosPorAño() {
		return kilometrosPorAño;
	}
	public void setKilometrosPorAño(int kilometrosPorAño) {
		this.kilometrosPorAño = kilometrosPorAño;
	}
	public int getIdCobertura() {
		return idCobertura;
	}
	public void setIdCobertura(int idCobertura) {
		this.idCobertura = idCobertura;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public String getNumeroDePoliza() {
		return numeroDePoliza;
	}
	public void setNumeroDePoliza(String numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}
	public EstadoPoliza getEstado() {
		return estado;
	}
	public void setEstado(EstadoPoliza estado) {
		this.estado = estado;
	}
	public String getNumeroDeSolicitud() {
		return numeroDeSolicitud;
	}
	public void setNumeroDeSolicitud(String numeroDeSolicitud) {
		this.numeroDeSolicitud = numeroDeSolicitud;
	}
	
	
	
}
