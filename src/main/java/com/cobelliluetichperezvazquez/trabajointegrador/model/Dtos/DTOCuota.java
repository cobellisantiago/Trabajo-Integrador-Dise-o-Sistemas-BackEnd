package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;

public class DTOCuota {
    Calendar ultimoDiaDePago;
    Calendar fechaDeVencimiento;
    Integer valorActual;
    Integer valorOriginal;


    public Calendar getUltimoDiaDePago() {
        return ultimoDiaDePago;
    }

    public Integer getValorActual() {
        return valorActual;
    }

    public Integer getValorOriginal() {
        return valorOriginal;
    }

    public void setUltimoDiaDePago(Calendar ultimoDiaDePago) {
        this.ultimoDiaDePago = ultimoDiaDePago;
    }

    public void setValorActual(Integer valorActual) {
        this.valorActual = valorActual;
    }

    public void setValorOriginal(Integer valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public Calendar getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Calendar fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
