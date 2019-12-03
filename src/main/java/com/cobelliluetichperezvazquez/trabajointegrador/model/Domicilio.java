package com.cobelliluetichperezvazquez.trabajointegrador.model;



import org.springframework.lang.Nullable;

import javax.persistence.*;


@Entity
public class Domicilio {

    @GeneratedValue
    @Id
    Integer idDomicilio;
    String calle;
    Integer numero;
    Integer piso;
    String departamento;
    Integer codigoPostal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localidad")
    Localidad localidad;

    public Domicilio() {

    }

    public Domicilio( String calle, Integer numero, Integer piso, String departamento, Integer codigoPostal, Localidad localidad) {

        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
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