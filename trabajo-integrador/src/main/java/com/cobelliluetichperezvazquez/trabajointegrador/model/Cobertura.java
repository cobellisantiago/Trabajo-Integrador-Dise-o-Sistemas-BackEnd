package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Cobertura {

    int idCobertura;
    String nombre;
    String descripcion;

    public Cobertura() {

    }

    public Cobertura(int idCobertura, String nombre, String descripcion) {
        this.idCobertura = idCobertura;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}