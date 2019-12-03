package com.cobelliluetichperezvazquez.trabajointegrador.gestores;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTODomicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Localidad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Pais;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Provincia;
import org.hibernate.HibernateException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Repository
public class GestorDomicilio {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    @Autowired
    private ModelMapper modelMapper;

    public Domicilio obtener(Integer id){
        Domicilio domicilio = null;
        try {
            domicilio = gestorBaseDeDatos.findDomicilioById(id);
        }
        catch (Exception e){
            throw new NullPointerException();
        }
        return domicilio;
    }

    public Localidad obtenerLocalidad(Integer id){
        Localidad localidad = null;
        try {
           localidad = gestorBaseDeDatos.findLocalidadById(id);
        }
        catch (Exception e){
            throw new NullPointerException();
        }
        return localidad;
    }

    public Provincia obtenerProvincia(Integer id){
        Provincia provincia = null;
        try {
            provincia = gestorBaseDeDatos.findProvinciaById(id);
        }
        catch (Exception e){
            throw new NullPointerException();
        }
        return provincia;
    }

    public Pais obtenerPais(Integer id){
        Pais pais = null;
        try {
            pais = gestorBaseDeDatos.findPaisById(id);
        }
        catch (Exception e){
            throw new NullPointerException();
        }
        return pais;
    }

    public void guardar(DTODomicilio dtoDomicilio) {
        if(dtoDomicilio.getCalle()==null) throw new IllegalArgumentException("Calle del domicilio nula");
        if(dtoDomicilio.getNumero()==null) throw new IllegalArgumentException("Numero del domicilio nulo");
        if(dtoDomicilio.getIdLocalidad()==null) throw new IllegalArgumentException("Id localidad del domicilio nula");
        if(dtoDomicilio.getIdProvincia()==null) throw new IllegalArgumentException("Id provincia del domicilio nula");
        if(dtoDomicilio.getIdPais()==null) throw new IllegalArgumentException("Id pais del domicilio nula");

        Domicilio domicilio = modelMapper.map(dtoDomicilio,Domicilio.class);
        try {
            gestorBaseDeDatos.saveDomicilio(domicilio);
        }
        catch (Exception e) {
            throw new NullPointerException("El domicilio no pudo ser guardado en la BDD");
        }
    }

    public void borrar(Integer idDomicilio) {
        throw new NotImplementedException();
    }
}