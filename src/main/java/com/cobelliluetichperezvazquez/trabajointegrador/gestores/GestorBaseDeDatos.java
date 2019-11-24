package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;


@Repository
@Transactional
public class GestorBaseDeDatos {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    public GestorBaseDeDatos(){}

    public Localidad findLocalidadById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Localidad localidad = session.get(Localidad.class, id);
        //this.sessionFactory.close();
        return localidad;
    }

    public Provincia findProvinciaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Provincia provincia =  session.get(Provincia.class, id);
        //this.sessionFactory.close();
        return provincia;
    }

    public Pais findPaisById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pais pais = session.get(Pais.class, id);
        //this.sessionFactory.close();
        return pais;
    }

    /* Utilizamos la session para obtener el domicilio de la base de datos */

    public Domicilio findDomicilioById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Domicilio domicilio =  session.get(Domicilio.class, id);
        //this.sessionFactory.close();
        return domicilio;
    }

    public List<Cliente> findAllCliente() {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Cliente.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los clientes");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public List<Cliente> findAllCliente(String apellido, String nombre, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento) {
        List objects = null;
        String consulta=("from " + Cliente.class.getName()+" c where 1=1");
        try {
            if(apellido!=null) consulta = consulta+" and c.apellido="+apellido;
            if(nombre!=null) consulta = consulta+" and c.nombre="+nombre;
            if(tipoDeDocumento!=null) consulta = consulta+" and c.tipoDeDocumento="+tipoDeDocumento;
            if(numeroDeDocumento!=null) consulta = consulta+" and c.numeroDeDocumento="+numeroDeDocumento;
            System.out.println(consulta);
            Query query = this.sessionFactory.getCurrentSession().createQuery(consulta);
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los clientes");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }
    public Cliente findClienteById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cliente cliente =  session.get(Cliente.class, id);
        //this.sessionFactory.close();
        return cliente;
    }

    public List<Cobertura> findAllCobertura() {
        List objects = null;
        try {
           Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Cobertura.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las coberturas");//handleException(e);
        } finally {
           // HibernateFactory.close(session);
        }
        return objects;
    }

    public Cobertura findCoberturaById(int idCobertura) {
        Session session = this.sessionFactory.getCurrentSession();
        Cobertura cobertura =  session.get(Cobertura.class, idCobertura);
        //this.sessionFactory.close();
        return cobertura;
    }

    public List<Marca> findAllMarca() {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Marca.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las marcas");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public List<Modelo> findAllModeloByMarca(int idMarca) {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Modelo.class.getName() + " m where m.marca="+idMarca);
            objects = query.list();
            System.out.println(objects);
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los modelos");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public List<AñoFabricacion> findAllAñosByModelo(int idModelo) {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + AñoFabricacion.class.getName() + " a where a.modelo="+idModelo);
            objects = query.list();

        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los anios");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public boolean saveDomicilio(Domicilio domicilio){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        //Save employee
        session.save(domicilio);
        session.getTransaction().commit();
        //this.sessionFactory.close();
        return true;
    }

    public Integer saveHijo(Hijo hijo){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        //Save employee
        Integer id = (Integer) session.save(hijo);
        session.getTransaction().commit();
        //this.sessionFactory.close();
        return id;
    }

   public boolean findPoliza(String patente, String motor, String chasis){
        boolean check = false;
        List objects = null;
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("id from " + Poliza.class.getName() + " p where p.patente="+patente+" or p.motor="+ motor + " or p.chasis="+chasis);
        objects = query.list();

        //Query query1 = session.createQuery("SELECT p.patente FROM Poliza p");
//        List<String[]> listaPatente = query.list();
//        Query query = session.createQuery("SELECT p.chasisVehiculo FROM Poliza p");
//        List<String[]> listaChasis = query.list();
//        Query query = session.createQuery("SELECT p.motorVehiculo FROM Poliza p");
//        List<String[]> listaMotorVehiculo = query.list();

//        for( String[] datos : listaPatente ){
//            if(datos.equals(patente)){
//                check = true;
//            }
//        }
//        for( String[] datos : listaChasis ){
//            if(datos.equals(chasis)){
//                check = true;
//            }
//        }for( String[] datos : listaMotorVehiculo ){
//            if(datos.equals(motor)){
//                check = true;
//            }
//        }
        return (objects.isEmpty());
    }

    public Poliza findPolizaById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Poliza poliza =  session.get(Poliza.class, id);
        //this.sessionFactory.close();
        return poliza;
    }

    public boolean savePoliza(Poliza poliza){
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction();
        //Save employee
        session.save(poliza);
        session.getTransaction().commit();
        return true;
    }

    public boolean saveMedidasDeSeguridad(MedidasDeSeguridad medidasDeSeguridad){
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction();
        session.save(medidasDeSeguridad);
        session.getTransaction().commit();
        return true;
    }

    public void savePremio(Premio premio) {
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction();
        session.save(premio);
        session.getTransaction().commit();
    }

    public List<Provincia> findAllProvincia(){
        System.out.println("Voy a buscar provincias");
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Provincia.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las provincias");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public List<Localidad> findAllLocalidadByProvincia(int idProvincia){
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Localidad.class.getName()+" l where l.provincia="+idProvincia);
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las localidades");//handleException(e);
        } finally {
            // HibernateFactory.close(session);
        }
        return objects;
    }

    public Modelo findModeloById(int idModelo) {
        Session session = this.sessionFactory.getCurrentSession();
        Modelo modelo =  session.get(Modelo.class, idModelo);
        //this.sessionFactory.close();
        return modelo;
    }
}