package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;


@Entity
public class AñoFabricacion {

    @Id
    @GeneratedValue
    Integer id;
    int año;
    int porcentajeRobo;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modelo")
    Modelo modelo;



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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}