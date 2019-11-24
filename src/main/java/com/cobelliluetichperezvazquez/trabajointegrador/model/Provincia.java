package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;

@Entity
public class Provincia {

    @GeneratedValue
    @Id
    Integer idProvincia;
    String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pais")
    Pais pais;

    public Provincia() {

    }

    public Provincia(Integer idProvincia, String nombre, Pais pais) {
        this.idProvincia = idProvincia;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
