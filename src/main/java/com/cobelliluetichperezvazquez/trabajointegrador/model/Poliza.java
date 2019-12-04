package com.cobelliluetichperezvazquez.trabajointegrador.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;

import javax.persistence.*;

@Entity
public class Poliza {
    @Id
    String numeroDePoliza;
    Calendar fechaInicioVigencia;
    Calendar fechaFinVigencia;
    Calendar fechaDeEmision;
    String motorVehiculo;
    String chasisVehiculo;
    Integer sumaAsegurada;
    String patente;
    Integer kilometrosPorAño;
    FormaDePago formaDePago;
    Integer añoVehiculo;
    EstadoPoliza estado;
    NumeroDeSiniestros numeroDeSiniestros;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_FactoresCaracteristicosOriginarios")
    FactoresCaracteristicosOriginarios factoresCaracteristicosOriginarios;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitudPoliza")
    SolicitudDePoliza solicitudDePoliza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modelo")
    Modelo modelo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_premio")
    Premio premio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_descuento")
    Descuentos descuentos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medidas_seguridad")
    MedidasDeSeguridad medidasDeSeguridad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cobertura")
    Cobertura cobertura;

    @OneToMany(fetch = FetchType.LAZY)
    List<Cuota> cuotas;

    @Transient
    List<Hijo> hijos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_domicilio_riesgo")
    Localidad domicilioDeRiesgo;

    public Poliza() {

    }

    /*public Poliza(String numeroDePoliza, Calendar fechaInicioVigencia, Calendar fechaFinVigencia, Calendar fechaDeEmision,
                  String motorVehiculo, String chasisVehiculo, Integer sumaAsegurada, String patente, Integer kilometrosPorAño,
                  FormaDePago formaDePago, Integer añoVehiculo, EstadoPoliza estado, Cliente cliente, Modelo modelo,
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
    }*/


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

   public List<Cuota> getCuotas() {
        return cuotas;
   }

   public void setCuotas(List<Cuota> cuotas) {
       this.cuotas = cuotas;
   }

   public String getNumeroDePoliza() {
        return numeroDePoliza;
   }

    public void setNumeroDePoliza(String numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
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

    public Calendar getFechaDeEmision() {
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

    public Integer getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Integer sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getKilometrosPorAño() {
        return kilometrosPorAño;
    }

    public void setKilometrosPorAño(Integer kilometrosPorAño) {
        this.kilometrosPorAño = kilometrosPorAño;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(Integer añoVehiculo) {
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

    public NumeroDeSiniestros getNumeroDeSiniestros() {
        return numeroDeSiniestros;
    }

    public void setNumeroDeSiniestros(NumeroDeSiniestros numeroDeSiniestros) {
        this.numeroDeSiniestros = numeroDeSiniestros;
    }
}