package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class FactoresCaracteristicosOriginarios {

    Float porcentajeCobertura;
    Float porcentajeRoboMarca;
    Float porcentajeRoboModelo;
    Float porcentajeRoboProvincia;
    Float porcentajeRoboLocalidad;
    Float porcentajePorKilometros;
    Float porcentajeSiniestro;
    Float porcentajePorHijo;

    public FactoresCaracteristicosOriginarios() {

    }

    public FactoresCaracteristicosOriginarios(Float porcentajeCobertura, Float porcentajeRoboMarca,
                                              Float porcentajeRoboModelo, Float porcentajeRoboProvincia, Float porcentajeRoboLocalidad,
                                              Float porcentajePorKilometros, Float porcentajeSiniestro, Float porcentajePorHijo) {
        this.porcentajeCobertura = porcentajeCobertura;
        this.porcentajeRoboMarca = porcentajeRoboMarca;
        this.porcentajeRoboModelo = porcentajeRoboModelo;
        this.porcentajeRoboProvincia = porcentajeRoboProvincia;
        this.porcentajeRoboLocalidad = porcentajeRoboLocalidad;
        this.porcentajePorKilometros = porcentajePorKilometros;
        this.porcentajeSiniestro = porcentajeSiniestro;
        this.porcentajePorHijo = porcentajePorHijo;
    }

    public Float getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(Float porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public Float getPorcentajeRoboMarca() {
        return porcentajeRoboMarca;
    }

    public void setPorcentajeRoboMarca(Float porcentajeRoboMarca) {
        this.porcentajeRoboMarca = porcentajeRoboMarca;
    }

    public Float getPorcentajeRoboModelo() {
        return porcentajeRoboModelo;
    }

    public void setPorcentajeRoboModelo(Float porcentajeRoboModelo) {
        this.porcentajeRoboModelo = porcentajeRoboModelo;
    }

    public Float getPorcentajeRoboProvincia() {
        return porcentajeRoboProvincia;
    }

    public void setPorcentajeRoboProvincia(Float porcentajeRoboProvincia) {
        this.porcentajeRoboProvincia = porcentajeRoboProvincia;
    }

    public Float getPorcentajeRoboLocalidad() {
        return porcentajeRoboLocalidad;
    }

    public void setPorcentajeRoboLocalidad(Float porcentajeRoboLocalidad) {
        this.porcentajeRoboLocalidad = porcentajeRoboLocalidad;
    }

    public Float getPorcentajePorKilometros() {
        return porcentajePorKilometros;
    }

    public void setPorcentajePorKilometros(Float porcentajePorKilometros) {
        this.porcentajePorKilometros = porcentajePorKilometros;
    }

    public Float getPorcentajeSiniestro() {
        return porcentajeSiniestro;
    }

    public void setPorcentajeSiniestro(Float porcentajeSiniestro) {
        this.porcentajeSiniestro = porcentajeSiniestro;
    }

    public Float getPorcentajePorHijo() {
        return porcentajePorHijo;
    }

    public void setPorcentajePorHijo(Float porcentajePorHijo) {
        this.porcentajePorHijo = porcentajePorHijo;
    }



}