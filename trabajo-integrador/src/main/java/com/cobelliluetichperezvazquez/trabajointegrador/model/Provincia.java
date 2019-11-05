package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Provincia {

    int idProvincia;
    String nombre;
    Float porcentajeRobo;
    Pais pais;

    public Provincia() {

    }

    public Provincia(int idProvincia, String nombre, Float porcentajeRobo, Pais pais) {
        this.idProvincia = idProvincia;
        this.nombre = nombre;
        this.porcentajeRobo = porcentajeRobo;
        this.pais = pais;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPorcentajeRobo() {
        return porcentajeRobo;
    }

    public void setPorcentajeRobo(Float porcentajeRobo) {
        this.porcentajeRobo = porcentajeRobo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }



}
