package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;

public class DTOPoliza {

    Integer idLocalidad;
    Integer idProvincia;
    Integer idMarca;
    Integer idModelo;
    Integer idAñoVehiculo;
    int idCobertura;

    String motorVehiculo;
    String chasisVehiculo;
    String patente;
    Calendar fechaInicioVigencia;
    Calendar fechaFinVigencia;

    float sumaAsegurada;
    int idPremio;
    float importesporDescuentos;
    float montoTotalAbonar;
    int kilometrosPorAño;
    //NumeroDeSiniestros numeroSiniestrosUltimoAño;
    FormaDePago formaDePago;
    String numeroDePoliza;
    EstadoPoliza estado;
    String numeroDeSolicitud;
    int idCliente;


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
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

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
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

    public Integer getIdAñoVehiculo() {
        return idAñoVehiculo;
    }

    public void setAñoVehiculo(Integer idAñoVehiculo) {
        this.idAñoVehiculo = idAñoVehiculo;
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

    public int getidCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}