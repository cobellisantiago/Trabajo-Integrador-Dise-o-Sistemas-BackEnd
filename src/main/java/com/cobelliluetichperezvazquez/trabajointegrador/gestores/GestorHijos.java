package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Hijo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GestorHijos {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public List<Integer> crear(List<DTOHijo> dtoHijos) {
        List<Integer> ids = new ArrayList<>();
        for(DTOHijo dto : dtoHijos) {
            Hijo hijo = new Hijo();
            hijo.setIdHijo(0);
            hijo.setEstadoCivil(dto.getEstadoCivil());
            hijo.setSexo(dto.getSexo());
            hijo.setFechaDeNacimiento(dto.getFechaDeNacimiento());
            try {
                Integer id = gestorBaseDeDatos.saveHijo(hijo); // save hijo me devuelve el id del hijo
                ids.add(id);
            }
            catch (Exception e) {
                throw new NullPointerException("El hijo no pudo ser guardado en la BDD"); //ver id
            }
        }
        return ids;
    }

}