package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Modelo {

    int idModelo;
    String nombre;
    Float porcentajeRobo;
    AñoFabricacion añoFabricacion;
    Marca marca;


    public Modelo() {

    }

    public Modelo(int idModelo, String nombre, Float porcentajeRobo, AñoFabricacion añoFabricacion, Marca marca) {
        this.idModelo = idModelo;
        this.nombre = nombre;
        this.porcentajeRobo = porcentajeRobo;
        this.añoFabricacion = añoFabricacion;
        this.marca = marca;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
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

    public AñoFabricacion getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(AñoFabricacion añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}