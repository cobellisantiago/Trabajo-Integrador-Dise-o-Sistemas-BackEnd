package com.cobelliluetichperezvazquez.trabajointegrador.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;

import javax.persistence.*;

@Entity
public class Poliza {
    @Id
    String numeroDePoliza;
    Date fechaInicioVigencia;
    Date fechaFinVigencia;
    Date fechaDeEmision;
    String motorVehiculo;
    String chasisVehiculo;
    Float sumaAsegurada;
    String patente;
    int kilometrosPorAño;
    FormaDePago formaDePago;
    int añoVehiculo;
    EstadoPoliza estado;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_FactoresCaracteristicosOriginarios")
    FactoresCaracteristicosOriginarios factoresCaracteristicosOriginarios;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_solicitudPoliza")
    SolicitudDePoliza solicitudDePoliza;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_modelo")
    Modelo modelo;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_premio")
    Premio premio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_descuento")
    Descuentos descuentos;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_medidas_seguridad")
    MedidasDeSeguridad medidasDeSeguridad;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_cobertura")
    Cobertura cobertura;

    @ManyToOne(cascade = {CascadeType.ALL})
    List<Cuota> cuotas;

    @ManyToMany(cascade = {CascadeType.ALL})
    List<Hijo> hijos;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_domicilio_riesgo")
    Localidad domicilioDeRiesgo;

    public Poliza() {

    }

    public Poliza(String numeroDePoliza, Date fechaInicioVigencia, Date fechaFinVigencia, Date fechaDeEmision,
                  String motorVehiculo, String chasisVehiculo, Float sumaAsegurada, String patente, int kilometrosPorAño,
                  FormaDePago formaDePago, int añoVehiculo, EstadoPoliza estado, Cliente cliente, Modelo modelo,
                  Premio premio, Descuentos descuentos, MedidasDeSeguridad medidasDeSeguridad, Cobertura cobertura,
                  List<Hijo> hijos, Localidad domicilioDeRiesgo) {

        this.numeroDePoliza = numeroDePoliza;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaDeEmision = fechaDeEmision;
        this.motorVehiculo = motorVehiculo;
        this.chasisVehiculo = chasisVehiculo;
        this.sumaAsegurada = sumaAsegurada;
        this.patente = patente;
        this.kilometrosPorAño = kilometrosPorAño;
        this.formaDePago = formaDePago;
        this.añoVehiculo = añoVehiculo;
        this.estado = estado;
        this.cliente = cliente;
        this.modelo = modelo;
        this.premio = premio;
        this.descuentos = descuentos;
        this.medidasDeSeguridad = medidasDeSeguridad;
        this.cobertura = cobertura;
        this.hijos = hijos;
    }


    public FactoresCaracteristicosOriginarios getFactoresCaracteristicosOriginarios() {
        return factoresCaracteristicosOriginarios;
    }

    public void setFactoresCaracteristicosOriginarios(FactoresCaracteristicosOriginarios factoresCaracteristicosOriginarios) {
        this.factoresCaracteristicosOriginarios = factoresCaracteristicosOriginarios;
    }

    public SolicitudDePoliza getSolicitudDePoliza() {
        return solicitudDePoliza;
    }

    public void setSolicitudDePoliza(SolicitudDePoliza solicitudDePoliza) {
        this.solicitudDePoliza = solicitudDePoliza;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    public int getIdDescuentos() {
        return idDescuentos;
    }

    public void setIdDescuentos(int idDescuentos) {
        this.idDescuentos = idDescuentos;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public int getIdFactoresCaracteristicosOriginarios() {
        return idFactoresCaracteristicosOriginarios;
    }

    public void setIdFactoresCaracteristicosOriginarios(int idFactoresCaracteristicosOriginarios) {
        this.idFactoresCaracteristicosOriginarios = idFactoresCaracteristicosOriginarios;
    }

    public int getIdMedidasDeSeguridad() {
        return idMedidasDeSeguridad;
    }

    public void setIdMedidasDeSeguridad(int idMedidasDeSeguridad) {
        this.idMedidasDeSeguridad = idMedidasDeSeguridad;
    }

    public String getNumeroSolicitudDePoliza() {
        return numeroSolicitudDePoliza;
    }

    public void setNumeroSolicitudDePoliza(String numeroSolicitudDePoliza) {
        this.numeroSolicitudDePoliza = numeroSolicitudDePoliza;
    }

    public String getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(String numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
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

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Calendar fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
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

    public Float getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Float sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKilometrosPorAño() {
        return kilometrosPorAño;
    }

    public void setKilometrosPorAño(int kilometrosPorAño) {
        this.kilometrosPorAño = kilometrosPorAño;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public EstadoPoliza getEstado() {
        return estado;
    }

    public void setEstado(EstadoPoliza estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Descuentos getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Descuentos descuentos) {
        this.descuentos = descuentos;
    }

    public MedidasDeSeguridad getMedidasDeSeguridad() {
        return medidasDeSeguridad;
    }

    public void setMedidasDeSeguridad(MedidasDeSeguridad medidasDeSeguridad) {
        this.medidasDeSeguridad = medidasDeSeguridad;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }

    public Localidad getDomicilioDeRiesgo() {
        return domicilioDeRiesgo;
    }

    public void setDomicilioDeRiesgo(Localidad domicilioDeRiesgo) {
        this.domicilioDeRiesgo = domicilioDeRiesgo;
    }


}