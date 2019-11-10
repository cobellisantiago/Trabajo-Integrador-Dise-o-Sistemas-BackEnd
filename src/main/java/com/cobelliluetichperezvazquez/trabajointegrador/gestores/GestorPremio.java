package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Premio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorPremio {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Premio crearPremio(int idPremio) {
       Premio premio =  new Premio(idPremio);
       gestorBaseDeDatos.savePremio(premio);
       return premio;
    }
}
