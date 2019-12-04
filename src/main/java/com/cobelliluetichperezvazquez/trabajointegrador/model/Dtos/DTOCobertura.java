package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

public class DTOCobertura {

    Integer idCobertura;
    String nombre;
    String descripcion;
    Float porcentajeDePago;

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
