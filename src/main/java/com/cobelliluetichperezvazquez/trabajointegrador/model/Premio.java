package com.cobelliluetichperezvazquez.trabajointegrador.model;

public class Premio {

    int idPremio;
    Float prima;
    Float derechoDeEmision;
    Float totalPremio;

    public Premio() {

    }

    public Premio(int idPremio, Float prima, Float derechoDeEmision, Float totalPremio) {
        this.idPremio = idPremio;
        this.prima = prima;
        this.derechoDeEmision = derechoDeEmision;
        this.totalPremio = totalPremio;
    }

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
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