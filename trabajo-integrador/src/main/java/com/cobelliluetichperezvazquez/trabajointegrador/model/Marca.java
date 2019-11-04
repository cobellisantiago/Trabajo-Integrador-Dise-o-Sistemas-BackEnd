package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Marca {

    int idMarca;
    String nombre;
    Float porcentajeRobo;

    public Marca() {

    }

    public Marca(int idMarca, String nombre, Float porcentajeRobo) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.porcentajeRobo = porcentajeRobo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
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



}