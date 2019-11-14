package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import java.util.Date;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.CondicionIVA;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCivil;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.NumeroDeSiniestros;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.Sexo;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestorCliente {
	/*(int idCliente, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento, String apellido,
    String nombre, NumeroDeSiniestros numeroSiniestrosUltimoAño, CondicionIVA condicionIVA, String profesion,
    int añoDeRegistro, Sexo sexo, Date fechaDeNacimiento, String CUIL, String correoElectronico,
    EstadoCivil estadoCivil, EstadoCliente estado, Domicilio domicilio)*/

	@Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    //TODO Cliente - Obtener cliente segun un grupo de paremetros donde algunos son nulos
    //
    public Cliente obtener(Integer id){
        Cliente cliente = null;
        try {
            cliente = gestorBaseDeDatos.findClienteById(id);
        }catch (Exception ex){
            throw new NullPointerException();
        }
        return cliente;
    }



}