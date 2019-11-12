package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

public class DTOMedidasDeSeguridad {
    boolean seGuardaEnGarage;
    boolean alarma;
    boolean tuercasAntirrobo;
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

    public boolean isTuercasAntirrobo() {
        return tuercasAntirrobo;
    }

    public void setTuercasAntirrobo(boolean tuercasAntirrobo) {
        this.tuercasAntirrobo = tuercasAntirrobo;
    }

    public boolean isRastreo() {
        return rastreo;
    }

    public void setRastreo(boolean rastreo) {
        this.rastreo = rastreo;
    }
}