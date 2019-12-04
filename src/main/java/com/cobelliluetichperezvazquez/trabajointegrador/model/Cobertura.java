package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cobertura {

    @Id
    @GeneratedValue
    Integer idCobertura;
    String nombre;
    String descripcion;
    Float porcentajeDePago;

    public Cobertura() {}

    public Cobertura(Integer idCobertura, String nombre, String descripcion) {
        this.idCobertura = idCobertura;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(Integer idCobertura) {
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

    public Float getPorcentajeDePago() {
        return porcentajeDePago;
    }

    public void setPorcentajeDePago(Float porcentajeDePago) {
        this.porcentajeDePago = porcentajeDePago;
    }
}