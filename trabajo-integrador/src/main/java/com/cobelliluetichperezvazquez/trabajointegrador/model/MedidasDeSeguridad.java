package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class MedidasDeSeguridad {

    int medidasDeSeguridad;
    boolean alarma;
    boolean seGuardaEnGarage;
    boolean rastreo;
    boolean tuercasAntirobo;


    public MedidasDeSeguridad() {

    }

    public MedidasDeSeguridad(int medidasDeSeguridad, boolean alarma, boolean seGuardaEnGarage, boolean rastreo,
                              boolean tuercasAntirobo) {
        this.medidasDeSeguridad = medidasDeSeguridad;
        this.alarma = alarma;
        this.seGuardaEnGarage = seGuardaEnGarage;
        this.rastreo = rastreo;
        this.tuercasAntirobo = tuercasAntirobo;
    }

    public int getMedidasDeSeguridad() {
        return medidasDeSeguridad;
    }

    public void setMedidasDeSeguridad(int medidasDeSeguridad) {
        this.medidasDeSeguridad = medidasDeSeguridad;
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



}