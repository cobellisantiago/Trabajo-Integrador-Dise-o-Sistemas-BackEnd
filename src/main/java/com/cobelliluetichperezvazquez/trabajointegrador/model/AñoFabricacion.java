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
    int año;
    int porcentajeRobo;



    public AñoFabricacion() {

    }

    public AñoFabricacion( int año, int porcentajeRobo) {
        this.año = año;
        this.porcentajeRobo = porcentajeRobo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPorcentajeRobo() {
        return porcentajeRobo;
    }

    public void setPorcentajeRobo(int porcentajeRobo) {
        this.porcentajeRobo = porcentajeRobo;
    }

}