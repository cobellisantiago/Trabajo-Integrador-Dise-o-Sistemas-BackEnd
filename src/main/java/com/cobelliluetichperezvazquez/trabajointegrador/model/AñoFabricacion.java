package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table()
@Entity
public class AñoFabricacion {

    @Id
    @GeneratedValue
    Integer id;
    Integer año;
    Integer porcentajeRobo;

    public AñoFabricacion() {

    }

    public AñoFabricacion( Integer año, Integer porcentajeRobo) {
        this.año = año;
        this.porcentajeRobo = porcentajeRobo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getPorcentajeRobo() {
        return porcentajeRobo;
    }

    public void setPorcentajeRobo(Integer porcentajeRobo) {
        this.porcentajeRobo = porcentajeRobo;
    }

}