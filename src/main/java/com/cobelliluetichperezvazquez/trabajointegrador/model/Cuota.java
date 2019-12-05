package com.cobelliluetichperezvazquez.trabajointegrador.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Cuota {

    @Id
    @GeneratedValue
    Integer idCuota;
    Integer numeroCuota;
    Calendar fechaDeVencimiento;
    Float valorActual;
    Float valorOriginal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pago")
    Pago pago;


    //Verificar si es necesario hacer que la cuota sepa de la poliza
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_poliza")
    Poliza poliza;

    public Cuota() {

    }

    public Cuota(Integer numeroCuota, Calendar fechaDeVencimiento, Float valorActual, Float valorOriginal, Pago idPago, Poliza poliza) {
        this.numeroCuota = numeroCuota;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.valorActual = valorActual;
        this.valorOriginal = valorOriginal;
        this.pago = idPago;
        this.poliza = poliza;
    }
    public Integer getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(Integer idCuota) {
        this.idCuota = idCuota;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Calendar getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Calendar fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Float getValorActual() {
        return valorActual;
    }

    public void setValorActual(Float valorActual) {
        this.valorActual = valorActual;
    }

    public Float getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Float valorOriginal) {
        this.valorOriginal = valorOriginal;
    }


    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}