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

    //TODO Cliente - Obtener cliente segun un grupo de paremetros donde algunos son nulos

    public Cliente obtener(Integer id){
        Cliente cliente = null;
        try {
            cliente = gestorBaseDeDatos.findClienteById(id);
        } catch (Exception ex){
            throw new NullPointerException();
        }
        return cliente;
    }

    public Cliente crear(DTOCliente dtoCliente){
        Cliente cliente = new Cliente();
        if(dtoCliente.getIdCliente()==null) throw new NullPointerException("id cliente nulo");
        if(dtoCliente.getApellido()==null) throw new NullPointerException("apellido cliente nulo");
        if(dtoCliente.getNombre()==null) throw new NullPointerException("nombre cliente nulo");
        if(dtoCliente.getTipoDeDocumento()==null) throw new NullPointerException("tipo de doc cliente nulo");
        if(dtoCliente.getNumeroDeDocumento()==null) throw new NullPointerException("nro de doc cliente nulo");
        if(dtoCliente.getCUIL()==null) throw new NullPointerException("cuil cliente nulo");
        if(dtoCliente.getSexo()==null) throw new NullPointerException("sexo cliente nulo");
        if(dtoCliente.getFechaDeNacimiento()==null) throw new NullPointerException("fecha de nacimiento cliente nulo");
        if(dtoCliente.getIdDomicilio()==null) throw new NullPointerException("iddomicilio cliente nulo");
        //verificar si los campos calle, numero, pais, provincia y localidad del domicilio no son nulos
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
        cliente.getDomicilio().setIdDomicilio(dtoCliente.getIdDomicilio());
        //COMO CARGO TODOS LOS DATOS DEL DOMICILIO
        cliente.setCondicionIVA(dtoCliente.getCondicionIVA());
        cliente.setCorreoElectronico(dtoCliente.getCorreoElectronico());
        cliente.setEstadoCivil(dtoCliente.getEstadoCivil());
        cliente.setProfesion(dtoCliente.getProfesion());
        cliente.setAñoDeRegistro(dtoCliente.getAñoDeRegistro());
        cliente.setEstado(EstadoCliente.ACTIVO_AL_DIA);
        return cliente;
    }
    //TODO validar CUIL
    private boolean CUILvalido(String numeroDeDocumento, String CUIL) {
        return (CUIL.length() == numeroDeDocumento.length() - 3 || CUIL.length() == numeroDeDocumento.length() - 5)
                && (CUIL.contains(numeroDeDocumento));
   }

   private boolean edadValida(Calendar fechaDeNacimiento) {
       Calendar fecha = Calendar.getInstance();
       fecha.add(Calendar.YEAR,-18);
       return !fechaDeNacimiento.after(fecha);
   }

   public List<Cliente> buscar(Integer id, String apellido, String nombre, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento) {
        List<Cliente> clientes = new ArrayList<>();
        if(id!=null) { //solo habra un cliente con ese id
            clientes.add(gestorBaseDeDatos.findClienteById(id));
        }
        else { //ver como establecer varios criterios //hibernate criteria
            clientes.add((Cliente) gestorBaseDeDatos.findAllCliente(apellido,nombre,tipoDeDocumento,numeroDeDocumento));
        }
        return clientes;
   }
}
