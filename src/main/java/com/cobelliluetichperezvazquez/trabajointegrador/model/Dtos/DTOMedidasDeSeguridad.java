package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

public class DTOMedidasDeSeguridad {
    Integer idMedidasDeSeguridad;
    boolean seGuardaEnGarage;
    boolean alarma;
    boolean tuercasAntirobo;
    boolean rastreo;

    public boolean isSeGuardaEnGarage() {
        return seGuardaEnGarage;
    }

    public void setSeGuardaEnGarage(boolean seGuardaEnGarage) {
        this.seGuardaEnGarage = seGuardaEnGarage;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isTuercasAntirobo() {
        return tuercasAntirobo;
    }

    public void setTuercasAntirobo(boolean tuercasAntirobo) {
        this.tuercasAntirobo = tuercasAntirobo;
    }

    public boolean isRastreo() {
        return rastreo;
    }

    public void setRastreo(boolean rastreo) {
        this.rastreo = rastreo;
    }

    public Integer getIdMedidasDeSeguridad() {
        return idMedidasDeSeguridad;
    }

    public void setIdMedidasDeSeguridad(Integer idMedidasDeSeguridad) {
        this.idMedidasDeSeguridad = idMedidasDeSeguridad;
    }
}