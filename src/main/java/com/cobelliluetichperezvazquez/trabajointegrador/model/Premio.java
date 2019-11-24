package com.cobelliluetichperezvazquez.trabajointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Premio {

    @Id
    @GeneratedValue
    Integer idPremio;
    Float prima;
    Float derechoDeEmision;
    Float totalPremio;

    public Premio() {
    }

    public Premio(Integer idPremio){
        this.idPremio = idPremio;
    }

    public Premio(Integer idPremio, Float prima, Float derechoDeEmision, Float totalPremio) {
        this.idPremio = idPremio;
        this.prima = prima;
        this.derechoDeEmision = derechoDeEmision;
        this.totalPremio = totalPremio;
    }

    public Integer getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(Integer idPremio) {
        this.idPremio = idPremio;
    }

    public Float getPrima() {
        return prima;
    }

    public void setPrima(Float prima) {
        this.prima = prima;
    }

    public Float getDerechoDeEmision() {
        return derechoDeEmision;
    }

    public void setDerechoDeEmision(Float derechoDeEmision) {
        this.derechoDeEmision = derechoDeEmision;
    }

    public Float getTotalPremio() {
        return totalPremio;
    }

    public void setTotalPremio(Float totalPremio) {
        this.totalPremio = totalPremio;
    }



}