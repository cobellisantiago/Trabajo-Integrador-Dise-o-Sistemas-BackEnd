package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;
import java.util.List;

@Entity()
public class Modelo {

    @Id
    @GeneratedValue
    int idModelo;
    String nombre;
    Float porcentajeRobo;
//    @OneToMany(fetch = FetchType.EAGER)
//    List<AñoFabricacion> añosFabricacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca")
    Marca marca;


    public Modelo() {

    }

    public Modelo(Integer idModelo, String nombre, Float porcentajeRobo,  Marca marca) {
        this.idModelo = idModelo;
        this.nombre = nombre;
        this.porcentajeRobo = porcentajeRobo;
//        this.añosFabricacion = añoFabricacion;
        this.marca = marca;
    }

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

//    public List<AñoFabricacion> getAñoFabricacion() {
//        return añosFabricacion;
//    }
//
//    public void setAñoFabricacion(List<AñoFabricacion> añoFabricacion) {
//        this.añosFabricacion = añoFabricacion;
//    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}