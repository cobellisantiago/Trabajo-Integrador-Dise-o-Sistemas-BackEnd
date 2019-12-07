package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;


public class DTOPoliza {


    Integer idLocalidad;
    String numeroDePoliza;
    Integer idModelo;
    Integer anioFabricacion;
    Integer idCobertura;
    String motorVehiculo;
    String chasisVehiculo;
    String patente;
    Calendar fechaInicioVigencia;
    Calendar fechaFinVigencia;
    Integer sumaAsegurada;
    Integer idPremio;
    Float importesporDescuentos;
    Float montoTotalAbonar;
    Integer kilometrosPorAño;
    NumeroDeSiniestros numeroSiniestrosUltimoAño;
    String formaDePago;
    EstadoPoliza estado;
    String numeroDeSolicitud;
    String idCliente;
    Integer idMedidasDeSeguridad;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer modelo) {
        this.idModelo = modelo;
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

    public Calendar getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Calendar fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Calendar getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Calendar fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Integer getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Integer sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public Integer getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Integer idPremio) {
        this.idPremio = idPremio;
    }

    public Float getImportesporDescuentos() {
        return importesporDescuentos;
    }

    public void setImportesporDescuentos(Float importesporDescuentos) {
        this.importesporDescuentos = importesporDescuentos;
    }

    public Float getMontoTotalAbonar() {
        return montoTotalAbonar;
    }

    public void setMontoTotalAbonar(Float montoTotalAbonar) {
        this.montoTotalAbonar = montoTotalAbonar;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getKilometrosPorAño() {
        return kilometrosPorAño;
    }

    public void setKilometrosPorAño(Integer kilometrosPorAño) {
        this.kilometrosPorAño = kilometrosPorAño;
    }

    public Integer getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(Integer idCobertura) {
        this.idCobertura = idCobertura;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
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

    public NumeroDeSiniestros getNumeroSiniestrosUltimoAño() {
        return numeroSiniestrosUltimoAño;
    }

    public void setNumeroSiniestrosUltimoAño(NumeroDeSiniestros numeroSiniestrosUltimoAño) {
        this.numeroSiniestrosUltimoAño = numeroSiniestrosUltimoAño;
    }

    public Integer getIdMedidasDeSeguridad() {
        return idMedidasDeSeguridad;
    }

    public void setIdMedidasDeSeguridad(Integer idMedidasDeSeguridad) {
        this.idMedidasDeSeguridad = idMedidasDeSeguridad;
    }
}