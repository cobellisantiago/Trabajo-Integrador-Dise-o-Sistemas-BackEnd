package com.cobelliluetichperezvazquez.trabajointegrador.gestores;

import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.EstadoCliente;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
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

    public boolean findPoliza(String patente, String motor, String chasis){
        boolean check = false;
        List objects = null;
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from " + Poliza.class.getName() + " p where p.patente='"+patente+"' or p.motor='"+motor+"' or p.chasis='"+chasis+"'");
        objects = query.list();
        return !objects.isEmpty();
    }

    public Cliente findClienteById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cliente cliente =  session.get(Cliente.class, id);
        return cliente;
    }

    public Localidad findLocalidadById(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Localidad localidad = session.get(Localidad.class, id);
        return localidad;
    }

    public Modelo findModeloById(Integer idModelo) {
        Session session = this.sessionFactory.getCurrentSession();
        Modelo modelo =  session.get(Modelo.class, idModelo);
        return modelo;
    }

    public Poliza findPolizaById(String numeroDePoliza) {
        Session session = this.sessionFactory.getCurrentSession();
        Poliza poliza =  session.get(Poliza.class, numeroDePoliza);
        return poliza;
    }

    public MedidasDeSeguridad findMedidaById(Integer idMedidaDeSeguridad){
        Session session = this.sessionFactory.getCurrentSession();
        MedidasDeSeguridad medida =  session.get(MedidasDeSeguridad.class, idMedidaDeSeguridad);
        return medida;
    }

    public Provincia findProvinciaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Provincia provincia =  session.get(Provincia.class, id);
        return provincia;
    }

    public Pais findPaisById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pais pais = session.get(Pais.class, id);
        return pais;
    }

    public Domicilio findDomicilioById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Domicilio domicilio =  session.get(Domicilio.class, id);
        return domicilio;
    }

    public List<Cliente> findAllCliente() {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Cliente.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los clientes");//handleException(e);
        }
        return objects;
    }

    public AñoFabricacion findAñoFabricacionById(int idAnio){
        Session session = this.sessionFactory.getCurrentSession();
        AñoFabricacion anio =  session.get(AñoFabricacion.class, idAnio);
        return anio;
    }

    public List<Cliente> findAllCliente(String apellido, String nombre, TipoDeDocumento tipoDeDocumento, String numeroDeDocumento) {
        List objects = null;
        String consulta=("from "+Cliente.class.getName()+" c where 1=1 and (c.estado=0 or c.estado=1)");
        try {
            if(apellido!=null) consulta = consulta+" and c.apellido like'"+apellido+"%'";
            if(nombre!=null) consulta = consulta+" and c.nombre like'"+nombre+"%'";
            if(tipoDeDocumento!=null) consulta = consulta+" and c.tipoDeDocumento="+tipoDeDocumento;
            if(numeroDeDocumento!=null) consulta = consulta+" and c.numeroDeDocumento="+numeroDeDocumento;
            System.out.println(consulta);
            Query query = this.sessionFactory.getCurrentSession().createQuery(consulta);
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los clientes");//handleException(e);
        }
        return objects;
    }

    public List<Cuota> findCuotas(String numeroDePoliza) {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Cuota.class.getName() + " c where c.poliza='"+numeroDePoliza+"' and c.pago="+null);
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las cuotas");
        }
        return objects;
    }

    public List<Poliza> findAllPolizaByCliente(String idCliente) {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Poliza.class.getName() + " p where p.cliente='"+idCliente+"'");
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las polizas");
        }
        return objects;
    }

    public List<Cobertura> findAllCobertura() {
        List objects = null;
        try {
           Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Cobertura.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las coberturas");//handleException(e);
        }
        return objects;
    }

    public Cobertura findCoberturaById(Integer idCobertura) {
        Session session = this.sessionFactory.getCurrentSession();
        Cobertura cobertura =  session.get(Cobertura.class, idCobertura);
        return cobertura;
    }

    public List<Marca> findAllMarca() {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Marca.class.getName());
            objects = query.list();
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener las marcas");//handleException(e);
        }
        return objects;
    }

    public Marca findMarcaById(int idMarca) {
        Session session = this.sessionFactory.getCurrentSession();
        Marca marca =  session.get(Marca.class, idMarca);
        //this.sessionFactory.close();
        return marca;
    }

    public List<Modelo> findAllModeloByMarca(int idMarca) {
        List objects = null;
        try {
            Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Modelo.class.getName() + " m where m.marca="+idMarca);
            objects = query.list();
            System.out.println(objects);
        } catch (HibernateException e) {
            System.out.println("no se puedo obtener los modelos");//handleException(e);
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
        }
        return objects;
    }

    public boolean saveDomicilio(Domicilio domicilio){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(domicilio);
        session.getTransaction().commit();
        return true;
    }

    public boolean saveHijo(Hijo hijo){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(hijo);
        session.getTransaction().commit();
        return true;
    }



   public boolean savePoliza(Poliza poliza){
       Session session = this.sessionFactory.getCurrentSession();
       session.getTransaction();
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
       }
       return objects;
   }

   public List<Localidad> findAllLocalidadByProvincia(Integer idProvincia){
       List objects = null;
       try {
           Query query = this.sessionFactory.getCurrentSession().createQuery("from " + Localidad.class.getName()+" l where l.provincia="+idProvincia);
           objects = query.list();
       } catch (HibernateException e) {
           System.out.println("no se puedo obtener las localidades");
       }
       return objects;
   }

   public Marca findMarcaById(Integer idMarca) {
       Session session = this.sessionFactory.getCurrentSession();
       Marca marca =  session.get(Marca.class, idMarca);
       return marca;
   }
}