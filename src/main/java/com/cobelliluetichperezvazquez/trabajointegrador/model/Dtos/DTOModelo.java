package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import com.cobelliluetichperezvazquez.trabajointegrador.model.AñoFabricacion;

import java.util.List;

public class DTOModelo {

    int idModelo;
    String nombre;
    Float porcentajeRobo;
    List<AñoFabricacion> añosFabricacion;
    int idMarca;

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

    public List<AñoFabricacion> getAñosFabricacion() {
        return añosFabricacion;
    }

    public void setAñosFabricacion(List<AñoFabricacion> añosFabricacion) {
        this.añosFabricacion = añosFabricacion;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }


}
