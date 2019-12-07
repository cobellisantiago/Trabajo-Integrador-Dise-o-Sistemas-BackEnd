package com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos;

import java.util.List;

public class DTOAltaPoliza {

    DTOPoliza dtoPoliza;
    DTOMedidasDeSeguridad dtoMedidasDeSeguridad;
    List<DTOHijo> dtoHijos;

    public DTOAltaPoliza(DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, List<DTOHijo> dtoHijos) {
        this.dtoPoliza = dtoPoliza;
        this.dtoMedidasDeSeguridad = dtoMedidasDeSeguridad;
        this.dtoHijos = dtoHijos;
    }

    public DTOPoliza getDtoPoliza() {
        return dtoPoliza;
    }

    public void setDtoPoliza(DTOPoliza dtoPoliza) {
        this.dtoPoliza = dtoPoliza;
    }

    public DTOMedidasDeSeguridad getDtoMedidasDeSeguridad() {
        return dtoMedidasDeSeguridad;
    }

    public void setDtoMedidasDeSeguridad(DTOMedidasDeSeguridad dtoMedidasDeSeguridad) {
        this.dtoMedidasDeSeguridad = dtoMedidasDeSeguridad;
    }

    public List<DTOHijo> getDtoHijos() {
        return dtoHijos;
    }

    public void setDtoHijos(List<DTOHijo> dtoHijos) {
        this.dtoHijos = dtoHijos;
    }
}
