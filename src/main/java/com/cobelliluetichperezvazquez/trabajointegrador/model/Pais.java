package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pais {

    @Id
    @GeneratedValue
    int idPais;
    String nombre;

    public Pais() {

    }

    public Pais(int idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}