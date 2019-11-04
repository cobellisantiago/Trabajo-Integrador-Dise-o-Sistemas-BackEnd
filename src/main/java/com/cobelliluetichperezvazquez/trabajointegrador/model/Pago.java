package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pago {

    @Id
    @GeneratedValue
    int idPago;
    Float monto;
    Date fechaDeRealizacion;


    public Pago() {

    }

    public Pago(int idPago, Float monto, Date fechaDeRealizacion) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Date getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(Date fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }


}