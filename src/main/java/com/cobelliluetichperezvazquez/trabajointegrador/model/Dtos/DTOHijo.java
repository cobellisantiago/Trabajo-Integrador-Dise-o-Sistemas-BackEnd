package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.Calendar;
import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;

public class DTOHijo {

    Integer id;
    Calendar fechaDeNacimiento;
    Sexo sexo;
    EstadoCivil estadoCivil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}