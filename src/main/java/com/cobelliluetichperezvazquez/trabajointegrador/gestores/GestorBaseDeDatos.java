package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Localidad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Pais;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Provincia;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
//@Transactional
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
}
