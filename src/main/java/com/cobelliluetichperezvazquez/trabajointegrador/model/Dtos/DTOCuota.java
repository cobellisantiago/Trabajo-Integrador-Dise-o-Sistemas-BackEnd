package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;
import java.util.Date;

public class DTOCuota {
    Integer id;
    Integer numeroCuota;
    Date ultimoDiaDePago;
    Date fechaDeVencimiento;
    Integer valorActual;
    Integer valorOriginal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Date getUltimoDiaDePago() {
        return ultimoDiaDePago;
    }

    public Integer getValorActual() {
        return valorActual;
    }

    public Integer getValorOriginal() {
        return valorOriginal;
    }

    public void setUltimoDiaDePago(Date ultimoDiaDePago) {
        this.ultimoDiaDePago = ultimoDiaDePago;
    }

    public void setValorActual(Integer valorActual) {
        this.valorActual = valorActual;
    }

    public void setValorOriginal(Integer valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
