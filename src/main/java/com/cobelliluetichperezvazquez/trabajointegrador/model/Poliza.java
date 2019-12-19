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
    Integer anioFabricacion;
    EstadoPoliza estado;
    NumeroDeSiniestros numeroDeSiniestros;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_FactoresCaracteristicosOriginarios")
    FactoresCaracteristicosOriginarios factoresCaracteristicosOriginarios;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_solicitudPoliza")
    SolicitudDePoliza solicitudDePoliza;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_modelo")
    Modelo modelo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_premio")
    Premio premio;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_descuento")
    Descuentos descuentos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medidas_seguridad")
    MedidasDeSeguridad medidasDeSeguridad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cobertura")
    Cobertura cobertura;

    @OneToMany(fetch = FetchType.EAGER)
    List<Cuota> cuotas;

    @Transient
    List<Hijo> hijos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_domicilio_riesgo")
    Localidad idLocalidad;

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

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
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
        try{
            this.hijos = hijos;
        }catch (Exception e){
            System.out.println("No se puede setear hijos");
        }
    }

    public Localidad getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidad idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public NumeroDeSiniestros getNumeroDeSiniestros() {
        return numeroDeSiniestros;
    }

    public void setNumeroDeSiniestros(NumeroDeSiniestros numeroDeSiniestros) {
        this.numeroDeSiniestros = numeroDeSiniestros;
    }
}