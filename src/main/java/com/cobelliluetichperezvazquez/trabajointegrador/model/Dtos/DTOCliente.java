package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.CondicionIVA;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;

public class DTOCliente {
    String idCliente;
    String apellido;
    String nombre;
    TipoDeDocumento tipoDeDocumento;
    String numeroDeDocumento;
    String CUIL;
    Sexo sexo;
    Calendar fechaDeNacimiento;
    CondicionIVA condicionIVA;
    String correoElectronico;
    EstadoCivil estadoCivil;
    String profesion;
    Integer añoDeRegistro;
    Integer idDomicilio;


    public void setIdDomicilio(Integer domicilio) {
        this.idDomicilio = domicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public CondicionIVA getCondicionIVA() {
        return condicionIVA;
    }

    public void setCondicionIVA(CondicionIVA condicionIVA) {
        this.condicionIVA = condicionIVA;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Integer getAñoDeRegistro() {
        return añoDeRegistro;
    }

    public void setAñoDeRegistro(Integer añoDeRegistro) {
        this.añoDeRegistro = añoDeRegistro;
    }
}