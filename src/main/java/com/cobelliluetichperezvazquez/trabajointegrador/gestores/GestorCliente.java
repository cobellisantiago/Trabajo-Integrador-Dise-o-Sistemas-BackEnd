package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Cliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTOCliente;
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

	@Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    public Cliente obtener(String idCliente){
        Cliente cliente = null;
        try {
            cliente = gestorBaseDeDatos.findClienteById(idCliente);
        } catch (Exception ex) {
            throw new NullPointerException();
        }
        return cliente;
    }

    /*public Cliente crear(DTOCliente dtoCliente){
        Cliente cliente = new Cliente();
        if(dtoCliente.getIdCliente()==null) throw new NullPointerException("id cliente nulo");
        if(dtoCliente.getApellido()==null) throw new NullPointerException("apellido cliente nulo");
        if(dtoCliente.getNombre()==null) throw new NullPointerException("nombre cliente nulo");
        if(dtoCliente.getTipoDeDocumento()==null) throw new NullPointerException("tipo de doc cliente nulo");
        if(dtoCliente.getNumeroDeDocumento()==null) throw new NullPointerException("nro de doc cliente nulo");
        if(dtoCliente.getCUIL()==null) throw new NullPointerException("cuil cliente nulo");
        if(dtoCliente.getSexo()==null) throw new NullPointerException("sexo cliente nulo");
        if(dtoCliente.getFechaDeNacimiento()==null) throw new NullPointerException("fecha de nacimiento cliente nulo");
        if(dtoCliente.getDomicilio().getIdDomicilio()==null) throw new NullPointerException("iddomicilio cliente nulo");
        if(dtoCliente.getDomicilio().getCalle()==null) throw new NullPointerException("calle domicilio cliente nulo");
        if(dtoCliente.getDomicilio().getNumero()==null) throw new NullPointerException("numero domicilio cliente nulo");
        if(dtoCliente.getDomicilio().getIdPais()==null) throw new NullPointerException("idpais domicilio cliente nulo");
        if(dtoCliente.getDomicilio().getIdProvincia()==null) throw new NullPointerException("idprovincia domicilio cliente nulo");
        if(dtoCliente.getDomicilio().getIdLocalidad()==null) throw new NullPointerException("idlocalidad domicilio cliente nulo");
        if(dtoCliente.getDomicilio().getCodigoPostal()==null) throw new NullPointerException("codigopostalcliente nulo");
        if(dtoCliente.getCondicionIVA()==null) throw new NullPointerException("cond iva cliente nulo");
        if(dtoCliente.getCorreoElectronico()==null) throw new NullPointerException("email cliente nulo");
        if(dtoCliente.getEstadoCivil()==null) throw new NullPointerException("estado civil cliente nulo");
        if(dtoCliente.getProfesion()==null) throw new NullPointerException("profesion cliente nulo");
        if(dtoCliente.getAñoDeRegistro()==null) throw new NullPointerException("anio registro cliente nulo");
        //mostrar mensaje de error y pedir que ingrese los datos de nuevo
        List<Cliente> clientes = gestorBaseDeDatos.findAllCliente();
        for(Cliente c : clientes) {
            if(c.getNumeroDeDocumento()==dtoCliente.getNumeroDeDocumento() && c.getTipoDeDocumento().equals(dtoCliente.getTipoDeDocumento())) {
                //mostrar mensaje de error y pedir que ingrese los datos de nuevo
                throw new NullPointerException("ya existe cliente con ese tipo y nro de documento");
            } if(CUILvalido(dtoCliente.getNumeroDeDocumento(),dtoCliente.getCUIL())) {
                //mostrar mensaje de error y pedir que ingrese los datos de nuevo
                throw new NullPointerException("cuil invalido");
            } if(!edadValida(dtoCliente.getFechaDeNacimiento())) {
                //mostrar mensaje de error y pedir que ingrese los datos de nuevo
                throw new NullPointerException("edad invalida");
            }
        }

        //TODO generar numero de cliente, mostrarlo y solicitar confirmacion
        //cliente.setIdCliente();
        cliente.setApellido(dtoCliente.getApellido());
        cliente.setNombre(dtoCliente.getNombre());
        cliente.setTipoDeDocumento(dtoCliente.getTipoDeDocumento());
        cliente.setNumeroDeDocumento(dtoCliente.getNumeroDeDocumento());
        cliente.setCUIL(dtoCliente.getCUIL());
        cliente.setSexo(dtoCliente.getSexo());
        cliente.setFechaDeNacimiento(dtoCliente.getFechaDeNacimiento());
        cliente.getDomicilio().setIdDomicilio(dtoCliente.getDomicilio().getIdDomicilio());
        cliente.getDomicilio().setCalle(dtoCliente.getDomicilio().getCalle());
        cliente.getDomicilio().setNumero(dtoCliente.getDomicilio().getNumero());
        cliente.getDomicilio().setPiso(dtoCliente.getDomicilio().getPiso());
        cliente.getDomicilio().setDepartamento(dtoCliente.getDomicilio().getDepartamento());
        cliente.getDomicilio().getLocalidad().setIdLocalidad(dtoCliente.getDomicilio().getIdLocalidad());
        cliente.getDomicilio().getLocalidad().getProvincia().setIdProvincia(dtoCliente.getDomicilio().getIdProvincia());
        cliente.getDomicilio().getLocalidad().getProvincia().getPais().setIdPais(dtoCliente.getDomicilio().getIdPais());
        cliente.getDomicilio().setIdDomicilio(dtoCliente.getDomicilio().getIdDomicilio());
        cliente.getDomicilio().setIdDomicilio(dtoCliente.getDomicilio().getIdDomicilio());
        cliente.getDomicilio().setIdDomicilio(dtoCliente.getDomicilio().getIdDomicilio());
        cliente.setCondicionIVA(dtoCliente.getCondicionIVA());
        cliente.setCorreoElectronico(dtoCliente.getCorreoElectronico());
        cliente.setEstadoCivil(dtoCliente.getEstadoCivil());
        cliente.setProfesion(dtoCliente.getProfesion());
        cliente.setAñoDeRegistro(dtoCliente.getAñoDeRegistro());
        cliente.setEstado(EstadoCliente.ACTIVO_AL_DIA);
        return cliente;
    }

    private boolean CUILvalido(String numeroDeDocumento, String CUIL) {
        return (CUIL.length() == numeroDeDocumento.length() - 3 || CUIL.length() == numeroDeDocumento.length() - 5)
                && (CUIL.contains(numeroDeDocumento));
   }

   private boolean edadValida(Calendar fechaDeNacimiento) {
       Calendar fecha = Calendar.getInstance();
       fecha.add(Calendar.YEAR,-18);
       return !fechaDeNacimiento.after(fecha);
   }*/

   public List<Cliente> buscar(String id, String apellido, String nombre, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento) {
        List<Cliente> clientes = new ArrayList<>();
        clientes = gestorBaseDeDatos.findAllCliente(id,apellido,nombre,tipoDeDocumento,numeroDeDocumento);
        return clientes;
   }

   public List<String> obtenerTiposDeDocumento(){
        List<String> tipos = new ArrayList<>();
       for ( TipoDeDocumento tipo: TipoDeDocumento.values()) {
           tipos.add(tipo.toString());
       }
       return tipos;
   }
}
