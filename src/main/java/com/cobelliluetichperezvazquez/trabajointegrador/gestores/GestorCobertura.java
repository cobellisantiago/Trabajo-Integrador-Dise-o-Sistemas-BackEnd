package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cobertura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorCobertura {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    Cobertura encontrarCobertura(int idCobertura){
        return (gestorBaseDeDatos.findCoberturaById(idCobertura));
    }


}
