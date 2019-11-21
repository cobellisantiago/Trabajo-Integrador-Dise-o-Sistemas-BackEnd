package com.cobelliluetichperezvazquez.trabajointegrador.model;

import java.util.Calendar;
import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hijo {

    @Id
    @GeneratedValue
    int idHijo;
    Calendar fechaDeNacimiento;
    EstadoCivil estadoCivil;
    Sexo sexo;

    public Hijo() {

    }

    public Hijo(int idHijo, Calendar fechaDeNacimiento, EstadoCivil estadoCivil, Sexo sexo) {
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

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
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
