package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;

public class DTOPoliza {

    Integer idLocalidad;
    Integer idProvincia;
    Integer idMarca;
    Integer idModelo;
    Integer idAñoFabricacion;
    Integer idCobertura;
    String motorVehiculo;
    String chasisVehiculo;
    String patente;
    Calendar fechaInicioVigencia;
    Calendar fechaFinVigencia;

    float sumaAsegurada;
    Integer idPremio;
    float importesporDescuentos;
    float montoTotalAbonar;
    Integer kilometrosPorAño;
    //NumeroDeSiniestros numeroSiniestrosUltimoAño;
    FormaDePago formaDePago;
    String numeroDePoliza;
    EstadoPoliza estado;
    String numeroDeSolicitud;
    String idCliente;


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

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
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

    public float getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(float sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public Integer getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Integer idPremio) {
        this.idPremio = idPremio;
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

    public Integer getIdAñoFabricacion() {
        return idAñoFabricacion;
    }

    public void setIdAñoFabricacion(Integer añoFabricacion) {
        this.idAñoFabricacion = añoFabricacion;
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