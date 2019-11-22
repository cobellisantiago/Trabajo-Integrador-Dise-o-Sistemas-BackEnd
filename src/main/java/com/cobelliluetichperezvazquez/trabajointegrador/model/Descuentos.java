package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Descuentos {

    @Id
    @GeneratedValue
    Integer idDescuentos;
    Float descuentoPorUnidad;
    Float descuentoPorPagoSemestral;

    public Descuentos() {

    }

    public Descuentos(Integer idDescuentos, Float descuentoPorUnidad, Float descuentoPorPagoSemestral) {
        this.idDescuentos = idDescuentos;
        this.descuentoPorUnidad = descuentoPorUnidad;
        this.descuentoPorPagoSemestral = descuentoPorPagoSemestral;
    }

    public Integer getIdDescuentos() {
        return idDescuentos;
    }

    public void setIdDescuentos(Integer idDescuentos) {
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