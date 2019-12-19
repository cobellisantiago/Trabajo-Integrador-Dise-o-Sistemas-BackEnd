package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cuota;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOPago;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Pago;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository
public class GestorPago {


@Autowired
private  GestorCuotas gestorCuotas;
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;
    @Autowired
    private ModelMapper modelMapper;

    public Pago generarPago(DTOPago dtoPago) {
        //if (dtoPago.getFechaDeRealizacion() == null) throw new IllegalArgumentException("fecha realizacion pago nula");
        //if (dtoPago.getMonto() == null) throw new IllegalArgumentException("monto pago nulo");
        //Pago pago = modelMapper.map(dtoPago, Pago.class);

            Pago pago = new Pago();
            //Pago pagoNuevo;
            pago.setFechaDeRealizacion(Calendar.getInstance());
            pago.setMonto((float)100);
            gestorBaseDeDatos.savePago(pago);

            gestorCuotas.registrarPago(dtoPago.getNumeroDePoliza(),pago,dtoPago.getCuotasId());
            return pago;
        }




    /*    Domicilio domicilio = modelMapper.map(dtoDomicilio,Domicilio.class);
        try {
            gestorBaseDeDatos.saveDomicilio(domicilio);
        }
        catch (Exception e) {
            throw new NullPointerException("El domicilio no pudo ser guardado en la BDD");
        }
    }*/
}
