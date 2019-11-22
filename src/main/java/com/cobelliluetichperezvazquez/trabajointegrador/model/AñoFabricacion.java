package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;

@Table()
@Entity
public class AñoFabricacion {

    @Id
    @GeneratedValue
    Integer id;
    Integer porcentajeRobo;
    Integer año;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modelo")
    Modelo modelo;


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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}