package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Pago {

    @Id
    @GeneratedValue
    Integer idPago;
    Float monto;
    Calendar fechaDeRealizacion;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "numeroRecibo")
    Recibo recibo;

    public Pago() {

    }

    public Pago(Integer idPago, Float monto, Calendar fechaDeRealizacion) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Calendar getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(Calendar fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }


}