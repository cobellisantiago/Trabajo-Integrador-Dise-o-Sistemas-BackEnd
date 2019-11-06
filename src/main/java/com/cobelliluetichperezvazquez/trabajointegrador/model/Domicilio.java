package com.cobelliluetichperezvazquez.trabajointegrador.model;


import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;

@Table(name="DOMICILIO")
@Entity
public class Domicilio {

    @GeneratedValue
    @Id
    int idDomicilio;

    String calle;

    int numero;

    int piso;

    char departamento;

    int codigoPostal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localidad")
    Localidad localidad;

    public Domicilio() {

    }

    public Domicilio(int idDomicilio, String calle, int numero, int piso, char departamento, int codigoPostal, Localidad localidad) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public char getDepartamento() {
        return departamento;
    }

    public void setDepartamento(char departamento) {
        this.departamento = departamento;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        String texto = this.calle+" "+this.numero+" "+this.localidad.getNombre()+" "+this.localidad.getProvincia().getNombre()
                +" "+this.getLocalidad().getProvincia().getPais().getNombre();
        return texto;
    }
}