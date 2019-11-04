package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table()
@Entity
public class AñoFabricacion {

    @Id
    int año;

    public AñoFabricacion() {

    }

    public AñoFabricacion(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


}