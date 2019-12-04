package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MedidasDeSeguridad {

    @GeneratedValue
    @Id
    Integer idMedidasDeSeguridad;
    boolean alarma;
    boolean seGuardaEnGarage;
    boolean rastreo;
    boolean tuercasAntirobo;


    public MedidasDeSeguridad() {
    }

    public MedidasDeSeguridad(Integer idMedidasDeSeguridad, boolean alarma, boolean seGuardaEnGarage, boolean rastreo,
                              boolean tuercasAntirobo) {
        this.idMedidasDeSeguridad = idMedidasDeSeguridad;
        this.alarma = alarma;
        this.seGuardaEnGarage = seGuardaEnGarage;
        this.rastreo = rastreo;
        this.tuercasAntirobo = tuercasAntirobo;
    }

    public Integer getMedidasDeSeguridad() {
        return idMedidasDeSeguridad;
    }

    public void setMedidasDeSeguridad(Integer medidasDeSeguridad) {
        this.idMedidasDeSeguridad = medidasDeSeguridad;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isSeGuardaEnGarage() {
        return seGuardaEnGarage;
    }

    public void setSeGuardaEnGarage(boolean seGuardaEnGarage) {
        this.seGuardaEnGarage = seGuardaEnGarage;
    }

    public boolean isRastreo() {
        return rastreo;
    }

    public void setRastreo(boolean rastreo) {
        this.rastreo = rastreo;
    }

    public boolean isTuercasAntirobo() {
        return tuercasAntirobo;
    }

    public void setTuercasAntirobo(boolean tuercasAntirobo) {
        this.tuercasAntirobo = tuercasAntirobo;
    }


    public Integer getIdMedidasDeSeguridad() {
        return idMedidasDeSeguridad;
    }

    public void setIdMedidasDeSeguridad(Integer idMedidasDeSeguridad) {
        this.idMedidasDeSeguridad = idMedidasDeSeguridad;
    }
}