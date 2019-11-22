package com.cobelliluetichperezvazquez.trabajointegrador.model;



import javax.persistence.*;

@Entity
public class Localidad {

    @Id
    @GeneratedValue
    Integer idLocalidad;
    String nombre;
    Float porcentajeRobo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_provincia")
    Provincia provincia;


    public Localidad() {

    }

    public Localidad(Integer idLocalidad, String nombre, Float porcentajeRobo, Provincia provincia) {
        this.idLocalidad = idLocalidad;
        this.nombre = nombre;
        this.porcentajeRobo = porcentajeRobo;
        this.provincia = provincia;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }


}