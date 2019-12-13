package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;
import java.util.List;

public class DTOPago {
    Float monto;
    Calendar fechaDeRealizacion;
    String numeroDePoliza;
    List<Integer> cuotasId;


    public String getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(String numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public List<Integer> getCuotasId() {
        return cuotasId;
    }

    public void setCuotasId(List<Integer> cuotasId) {
        this.cuotasId = cuotasId;
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
