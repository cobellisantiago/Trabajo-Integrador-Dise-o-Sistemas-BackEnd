package com.cobelliluetichperezvazquez.trabajointegrador.model;

import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.*;


public class Cliente {

    int idCliente;
    TipoDeDocumento tipoDeDocumento;
    String numeroDeDocumento;
    String apellido;
    String nombre;
    NumeroDeSiniestros numeroSiniestrosUltimoAño;
    CondicionIVA condicionIVA;
    String profesion;
    int añoDeRegistro;
    Sexo sexo;
    Date fechaDeNacimiento;
    String CUIL;
    String correoElectronico;
    EstadoCivil estadoCivil;
    EstadoCliente estado;
    Domicilio domicilio;

    public Cliente() {

    }

    public Cliente(int idCliente, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento, String apellido,
                   String nombre, NumeroDeSiniestros numeroSiniestrosUltimoAño, CondicionIVA condicionIVA, String profesion,
                   int añoDeRegistro, Sexo sexo, Date fechaDeNacimiento, String CUIL, String correoElectronico,
                   EstadoCivil estadoCivil, EstadoCliente estado, Domicilio domicilio) {
        this.idCliente = idCliente;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroSiniestrosUltimoAño = numeroSiniestrosUltimoAño;
        this.condicionIVA = condicionIVA;
        this.profesion = profesion;
        this.añoDeRegistro = añoDeRegistro;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.CUIL = CUIL;
        this.correoElectronico = correoElectronico;
        this.estadoCivil = estadoCivil;
        this.estado = estado;
        this.domicilio = domicilio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NumeroDeSiniestros getNumeroSiniestrosUltimoAño() {
        return numeroSiniestrosUltimoAño;
    }

    public void setNumeroSiniestrosUltimoAño(NumeroDeSiniestros numeroSiniestrosUltimoAño) {
        this.numeroSiniestrosUltimoAño = numeroSiniestrosUltimoAño;
    }

    public CondicionIVA getCondicionIVA() {
        return condicionIVA;
    }

    public void setCondicionIVA(CondicionIVA condicionIVA) {
        this.condicionIVA = condicionIVA;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñoDeRegistro() {
        return añoDeRegistro;
    }

    public void setAñoDeRegistro(int añoDeRegistro) {
        this.añoDeRegistro = añoDeRegistro;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String cUIL) {
        CUIL = cUIL;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public EstadoCliente getEstado() {
        return estado;
    }

    public void setEstado(EstadoCliente estado) {
        this.estado = estado;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }


}