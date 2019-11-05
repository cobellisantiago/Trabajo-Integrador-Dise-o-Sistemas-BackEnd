package com.cobelliluetichperezvazquez.trabajointegrador.model;

import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;


public class Hijo {

    int idHijo;
    Date fechaDeNacimiento;
    EstadoCivil estadoCivil;
    Sexo sexo;

    public Hijo() {

    }

    public Hijo(int idHijo, Date fechaDeNacimiento, EstadoCivil estadoCivil, Sexo sexo) {
        this.idHijo = idHijo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
    }

    public int getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(int idHijo) {
        this.idHijo = idHijo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


}
