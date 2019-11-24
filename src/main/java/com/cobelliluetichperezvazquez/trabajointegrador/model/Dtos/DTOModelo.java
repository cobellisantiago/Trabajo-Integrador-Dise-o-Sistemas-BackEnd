package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import com.cobelliluetichperezvazquez.trabajointegrador.model.AñoFabricacion;

import java.util.List;

public class DTOModelo {

    Integer idModelo;
    String nombre;
    Float porcentajeRobo;
    Integer idMarca;
    List<DTOAñoFabricacion> añosFabricacion;


    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
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

    public List<DTOAñoFabricacion> getAñosFabricacion() {
        return añosFabricacion;
    }

    public void setAñosFabricacion(List<DTOAñoFabricacion> añosFabricacion) {
        this.añosFabricacion = añosFabricacion;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }


}
