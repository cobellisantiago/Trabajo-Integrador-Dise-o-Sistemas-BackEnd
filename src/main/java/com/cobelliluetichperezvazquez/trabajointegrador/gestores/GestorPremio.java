package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Descuentos;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Premio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.FormaDePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorPremio {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

public Premio generarPremio(Integer sumaAsegurada){
        Premio premio = new Premio();
    try {
        double totalPremio = (sumaAsegurada*0.07);
        double prima = (sumaAsegurada*0.01);
        double derechoEmision = (double) (Math.random()*100);
        premio.setTotalPremio((float) totalPremio);
        premio.setPrima((float) prima);
        premio.setDerechoDeEmision((float) derechoEmision);
        gestorBaseDeDatos.savePremio(premio);
        }
        catch (Exception e) {
            throw new NullPointerException("El premio no pudo ser guardado en la BDD: "+e);
        }
        return premio;
    }

    public Descuentos generarDescuentos(Integer sumaAsegurada, FormaDePago formaDePago){
        Descuentos descuentos = new Descuentos();
        try {
            double descuentoPorUnidad = (sumaAsegurada*0.01);
            double descuentoPorPagoSemestral = 0;
            if(formaDePago.equals(formaDePago.SEMESTRAL))
                descuentoPorPagoSemestral = sumaAsegurada*0.02;
            descuentos.setDescuentoPorPagoSemestral((float) descuentoPorPagoSemestral);
            descuentos.setDescuentoPorUnidad((float) descuentoPorUnidad);

            gestorBaseDeDatos.saveDescuentos(descuentos);
        }
        catch (Exception e) {
            throw new NullPointerException("Error guardando descuentos en la base de datos: "+e);
        }
        return descuentos;
    }
    
}
