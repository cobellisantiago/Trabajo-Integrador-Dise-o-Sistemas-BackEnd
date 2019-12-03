package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cuota;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository
public class GestorCuotas {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public List<Cuota> buscarCuotasVigentes(String numeroDePoliza){
        List<Cuota> cuotas = gestorBaseDeDatos.findCuotas(numeroDePoliza);
       /* for(Cuota c : cuotas) {
            Calendar hoy = Calendar.getInstance();
            if(c.getFechaDeVencimiento().equals(hoy) && c.getPoliza().getEstado()== EstadoPoliza.VIGENTE) {
                c.setValorActual(c.getValorOriginal());
            }
            else if(c.getFechaDeVencimiento().before(hoy) && c.getPoliza().getEstado()== EstadoPoliza.VIGENTE) {
                c.setValorActual(c.getValorOriginal()*110/100);
            }
            else if(c.getFechaDeVencimiento().after(hoy) && c.getPoliza().getEstado()== EstadoPoliza.VIGENTE) {
                c.setValorActual(c.getValorOriginal()*90/100);
            }
        }*/
        return cuotas;
    }


}