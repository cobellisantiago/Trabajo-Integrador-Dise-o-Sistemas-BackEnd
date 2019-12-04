package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorMarca {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Marca obtenerMarca(int id){
        return gestorBaseDeDatos.findMarcaById(id);
    }
}
