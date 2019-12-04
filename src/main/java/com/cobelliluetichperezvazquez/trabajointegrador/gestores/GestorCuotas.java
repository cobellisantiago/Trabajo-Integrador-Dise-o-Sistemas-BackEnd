package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.AñoFabricacion;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Cobertura;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Cuota;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoPoliza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository
public class GestorCuotas {

    @Autowired
    private GestorCobertura gestorCobertura;
    @Autowired
    private GestorModelo gestorModelo;
    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public List<Cuota> buscarCuotasVigentes(String numeroDePoliza){
        List<Cuota> cuotas = gestorBaseDeDatos.findCuotas(numeroDePoliza);
        for(Cuota c : cuotas) {
            Calendar hoy = Calendar.getInstance();
            if(c.getFechaDeVencimiento().equals(hoy)) {
                c.setValorActual(c.getValorOriginal());
            }
            else if(c.getFechaDeVencimiento().before(hoy)) {
                c.setValorActual(c.getValorOriginal()*110/100);
            }
            else if(c.getFechaDeVencimiento().after(hoy)) {
                c.setValorActual(c.getValorOriginal()*90/100);
            }
        }
        return cuotas;
    }

    public List<Cuota> calcularCuotas(Integer idCobertura,Integer idAnioModelo,String formaDePago){
        List<Cuota> cuotas = new ArrayList<>();
        Cobertura coberturaSeleccionada = gestorCobertura.encontrarCobertura(idCobertura);
        AñoFabricacion anioFabricacion = gestorModelo.obtenerAnioFabricacion(idAnioModelo);

        Float montoPoliza = anioFabricacion.getsumaAsegurada() * coberturaSeleccionada.getPorcentajeDePago();
        if(formaDePago.equals("mensual")){
            for(int i=1;i<=6;i++){
                Cuota cuota = new Cuota(i,null,(montoPoliza/6),(montoPoliza/6),null,null);
                cuotas.add(cuota);
            }
        }else{
            Cuota cuota = new Cuota(1,null,montoPoliza,montoPoliza,null,null);
        }

        return cuotas;
    }
}