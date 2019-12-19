package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOHijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Hijo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Poliza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GestorHijos {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;
//    @Autowired
//    private GestorPoliza gestorPoliza;

    public List<Hijo> crearHijos(List<DTOHijo> dtoHijos, Poliza poliza) {
        List<Hijo> hijos = new ArrayList<>();
        try {

            for (DTOHijo dto : dtoHijos) {
                Hijo hijo = new Hijo();
                hijo.setEstadoCivil(dto.getEstadoCivil());
                hijo.setSexo(dto.getSexo());
                hijo.setFechaDeNacimiento(dto.getFechaDeNacimiento());
                hijo.setPoliza(poliza);

                gestorBaseDeDatos.saveHijo(hijo); // save hijo me devuelve el id del hijo
                hijos.add(hijo);
            }
        } catch(Exception e){
                throw new NullPointerException("El hijo no pudo ser guardado en la BDD");
        }


        return hijos;
    }
}