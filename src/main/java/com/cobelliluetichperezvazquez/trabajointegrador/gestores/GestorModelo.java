package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.AñoFabricacion;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public class GestorModelo {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Modelo encontrarModelo(Integer idModelo) {
        return gestorBaseDeDatos.findModeloById(idModelo);
    }

    public List<AñoFabricacion> obtenerAniosFabricacion(Integer idModelo){
        return gestorBaseDeDatos.findAllAñosByModelo(idModelo);
    }

    public AñoFabricacion obtenerAnioFabricacion(Integer idAnio){
        return gestorBaseDeDatos.findAñoFabricacionById(idAnio);
    }

    public AñoFabricacion obtenerAnioFabricacionSegunModelo(Integer idModelo, Integer anio){
        return gestorBaseDeDatos.findAnioByModelo(idModelo,anio);
    }

}
