package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.*;
import java.util.Calendar;

@Table()
@Entity
public class AñoFabricacion {

    @Id
    @GeneratedValue
    Integer id;
    Integer sumaAsegurada;
    Integer año;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modelo")
    Modelo modelo;


    public AñoFabricacion() {

    }

    public AñoFabricacion( Integer año, Integer sumaAsegurada) {
        this.año = año;
        this.sumaAsegurada = sumaAsegurada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getsumaAsegurada() {
        return sumaAsegurada;
    }

    public void setsumaAsegurada(Integer sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public boolean masDeDiez(Integer año) {
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.YEAR,-10);
        return fecha.before(año);
    }
}