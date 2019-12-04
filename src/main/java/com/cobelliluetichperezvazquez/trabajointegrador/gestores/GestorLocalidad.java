package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorLocalidad {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Localidad encontrarLocalidad(Integer idLocalidad) {
        return gestorBaseDeDatos.findLocalidadById(idLocalidad);
    }
}
