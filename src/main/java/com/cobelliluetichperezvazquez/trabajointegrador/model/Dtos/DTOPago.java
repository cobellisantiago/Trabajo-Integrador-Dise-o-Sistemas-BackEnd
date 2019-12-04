package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;

public class DTOPago {
    Float monto;
    Calendar fechaDeRealizacion;

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
