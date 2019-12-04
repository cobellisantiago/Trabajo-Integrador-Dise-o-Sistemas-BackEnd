package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.MedidasDeSeguridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorMedidasDeSeguridad {
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public MedidasDeSeguridad crearMedidasDeSeguridad(int i, boolean alarma, boolean seGuardaEnGarage, boolean rastreo, boolean tuercasAntirrobo) {
        MedidasDeSeguridad medidasDeSeguridad = new MedidasDeSeguridad(i, alarma, seGuardaEnGarage, rastreo, tuercasAntirrobo);
        gestorBaseDeDatos.saveMedidasDeSeguridad(medidasDeSeguridad);
        return medidasDeSeguridad;
    }

    public MedidasDeSeguridad encontrarMedidaDeSeguridad(Integer idMedidaDeSeguridad) {
        return gestorBaseDeDatos.findMedidaById(idMedidaDeSeguridad);
    }
}
