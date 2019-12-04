package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SolicitudDePoliza {

    @Id
    String numeroSolicitudDePoliza;
    String motorVehiculo;
    String chasisVehiculo;
    String patente;
    Integer kilometrosPorAño;
    Integer añoVehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medidas_seguridad")
    MedidasDeSeguridad medidasDeSeguridad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cobertura")
    Cobertura cobertura;

    @Transient
    List<Hijo> hijos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_domicilio_riesgo")
    Localidad domicilioDeRiesgo;

    public String getNumeroSolicitudDePoliza() {
        return numeroSolicitudDePoliza;
    }

    public void setNumeroSolicitudDePoliza(String numeroSolicitudDePoliza) {
        this.numeroSolicitudDePoliza = numeroSolicitudDePoliza;
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

    public Integer getKilometrosPorAño() {
        return kilometrosPorAño;
    }

    public void setKilometrosPorAño(Integer kilometrosPorAño) {
        this.kilometrosPorAño = kilometrosPorAño;
    }

    public Integer getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(Integer añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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