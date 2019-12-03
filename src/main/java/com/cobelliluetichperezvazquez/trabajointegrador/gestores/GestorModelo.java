package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.AñoFabricacion;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GestorModelo {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Modelo encontrarModelo(int idModelo) {
        return gestorBaseDeDatos.findModeloById(idModelo);
    }

    public List<AñoFabricacion> obtenerAniosFabricacion(int idModelo){
        return gestorBaseDeDatos.findAllAñosByModelo(idModelo);
    }

    public AñoFabricacion obtenerAnioFabricacion(int idAnio){
        return gestorBaseDeDatos.findAñoFabricacionById(idAnio);
    }

}
