package com.cobelliluetichperezvazquez.trabajointegrador.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cuota {

    @Id
    @GeneratedValue
    int idCuota;
    int numeroCuota;

    Date fechaDeVencimiento;

    Float valorActual;

    Float valorOriginal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pago")
    Pago idPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_poliza")
    Poliza poliza;

    public Cuota() {

    }

    public Cuota(int numeroCuota, Date fechaDeVencimiento, Float valorActual, Float valorOriginal, Pago idPago, Poliza poliza) {
        this.numeroCuota = numeroCuota;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.valorActual = valorActual;
        this.valorOriginal = valorOriginal;
        this.idPago = idPago;
        this.poliza = poliza;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
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



}