package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Descuentos {

    int idDescuentos;
    Float descuentoPorUnidad;
    Float descuentoPorPagoSemestral;

    public Descuentos() {

    }

    public Descuentos(int idDescuentos, Float descuentoPorUnidad, Float descuentoPorPagoSemestral) {
        this.idDescuentos = idDescuentos;
        this.descuentoPorUnidad = descuentoPorUnidad;
        this.descuentoPorPagoSemestral = descuentoPorPagoSemestral;
    }

    public int getIdDescuentos() {
        return idDescuentos;
    }

    public void setIdDescuentos(int idDescuentos) {
        this.idDescuentos = idDescuentos;
    }

    public Float getDescuentoPorUnidad() {
        return descuentoPorUnidad;
    }

    public void setDescuentoPorUnidad(Float descuentoPorUnidad) {
        this.descuentoPorUnidad = descuentoPorUnidad;
    }

    public Float getDescuentoPorPagoSemestral() {
        return descuentoPorPagoSemestral;
    }

    public void setDescuentoPorPagoSemestral(Float descuentoPorPagoSemestral) {
        this.descuentoPorPagoSemestral = descuentoPorPagoSemestral;
    }


}