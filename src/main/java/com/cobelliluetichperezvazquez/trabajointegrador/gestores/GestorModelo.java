package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorModelo {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Modelo encontrarModelo(int idModelo) {
        return gestorBaseDeDatos.findModeloById(idModelo);
    }

}
