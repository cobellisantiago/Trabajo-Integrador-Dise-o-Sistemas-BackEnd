package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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

            Query query = this.sessionFactory.getCurrentSession().createQuery(
                    "from " + Modelo.class.getName() + " m where m.marca=1");

            objects = query.list();
            System.out.println(objects);
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los modelos");//handleException(e);
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
//

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
//

    }

}
