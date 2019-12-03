package com.cobelliluetichperezvazquez.trabajointegrador.controllers;
//Los controllers manejan las vistas (HTML)

import com.cobelliluetichperezvazquez.trabajointegrador.gestores.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.enums.TipoDeDocumento;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class controllerBasic {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;
    @Autowired
    private GestorPoliza gestorPoliza;
    @Autowired
    private GestorCuotas gestorCuotas;
    @Autowired
    private GestorCliente gestorCliente;
    @Autowired
    private GestorModelo gestorModelo;
    @Autowired
    private GestorDomicilio gestorDomicilio;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(path = "/domicilio/provincia/{id}")
    public ResponseEntity<Object> getProvincia(@PathVariable(name="id") int id){

        Provincia provincia = gestorDomicilio.obtenerProvincia(id);
        DTOProvincia dtoProvincia = modelMapper.map(provincia, DTOProvincia.class);

        if(dtoProvincia!=null) {
            return new ResponseEntity<>(dtoProvincia,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/domicilio/pais/{id}")
    public ResponseEntity<Object> getPais(@PathVariable(name="id") int id){

        Pais pais = gestorDomicilio.obtenerPais(id);
        DTOPais dtoPais = modelMapper.map(pais, DTOPais.class);

        if(dtoPais!=null) {
            return new ResponseEntity<>(dtoPais,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/domicilio/{id}")
    public ResponseEntity<Object> getDomicilio(@PathVariable(name="id") int id){

        Domicilio dom = gestorBaseDeDatos.findDomicilioById(id);
        DTODomicilio dtoDomicilio = modelMapper.map(dom, DTODomicilio.class);

        if(dtoDomicilio!=null) {
            return new ResponseEntity<>(dtoDomicilio,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/domicilio/localidad/{id}")
    public ResponseEntity<Object> getLocaliad(@PathVariable(name="id") int id){

        Localidad localidad = gestorDomicilio.obtenerLocalidad(id);
        DTOLocalidad dtoLocalidad = modelMapper.map(localidad, DTOLocalidad.class);

        if(dtoLocalidad!=null) {
            return new ResponseEntity<>(dtoLocalidad,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/cliente/{id}")
    public ResponseEntity<Object> getCliente(@PathVariable(name="id") int id){

        Cliente cliente = gestorCliente.obtener(id); //gestorBaseDeDatos.findClienteById(id);
        DTOCliente dtoCliente = modelMapper.map(cliente, DTOCliente.class);


        if(dtoCliente!=null) {
            return new ResponseEntity<>(dtoCliente,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/coberturas")
    public ResponseEntity<Object> getCoberturas(){
        List<Cobertura> coberturas = gestorBaseDeDatos.findAllCobertura();
        Type listType = new TypeToken<List<DTOCobertura>>() {}.getType();
        List<DTOCobertura> dtoCoberturas = modelMapper.map(coberturas, listType);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoCoberturas!=null) {
            return new ResponseEntity<>(dtoCoberturas,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/domicilio/provincia")
    public ResponseEntity<Object> getProvincia(){

        List<Provincia> provincias = gestorBaseDeDatos.findAllProvincia();
        Type listType = new TypeToken<List<DTOProvincia>>(){}.getType();
        List<DTOProvincia> dtoProvincias = modelMapper.map(provincias, listType);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoProvincias!=null) {
            return new ResponseEntity<>(dtoProvincias,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/domicilio/provincia/{id}/localidad") //Esta es la forma correcta de obtener el parametro
    public ResponseEntity<Object> getAllLocalidad(@PathVariable(name = "id") int idProvincia){
        System.out.println("Id provincia recivido: "+idProvincia);
        List<Localidad> localidades = gestorBaseDeDatos.findAllLocalidadByProvincia(idProvincia);
        System.out.println(localidades);
        Type listType = new TypeToken<List<DTOLocalidad>>(){}.getType();
        List<DTOLocalidad> dtoLocalidades = modelMapper.map(localidades, listType);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoLocalidades!=null) {
            return new ResponseEntity<>(dtoLocalidades,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    // ------------- VEHICULOS -----------------
    //
    @GetMapping(path = "/marca")
    public ResponseEntity<Object> getMarca(){

        List<Marca> marcas = gestorBaseDeDatos.findAllMarca();
        Type listDTOMarca = new TypeToken<List<DTOMarca>>() {}.getType();
        List<DTOMarca> dtoMarcas = modelMapper.map(marcas, listDTOMarca);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoMarcas!=null) {
            return new ResponseEntity<>(dtoMarcas,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/marca/{id}/modelo")
    public ResponseEntity<Object> getModelosByMarca(@PathVariable(name = "id") int id){

        List<Modelo> modelos = gestorBaseDeDatos.findAllModeloByMarca(id);
        Type listDTOModelo = new TypeToken<List<DTOModelo>>() {}.getType();
        List<DTOCobertura> dtoModelos = modelMapper.map(modelos, listDTOModelo);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoModelos!=null) {
            return new ResponseEntity<>(dtoModelos,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/modelo/{idModelo}/aniosFabricacion")
    public ResponseEntity<Object> getAniosByModelo( @PathVariable(name = "idModelo") int idModelo){

        List<AñoFabricacion> anios = gestorModelo.obtenerAniosFabricacion(idModelo); //gestorBaseDeDatos.findAllModeloByMarca(id);
        Type listDTOAnios = new TypeToken<List<DTOAñoFabricacion>>() {}.getType();
        List<DTOAñoFabricacion> dtoAnios = modelMapper.map(anios, listDTOAnios);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoAnios!=null) {
            return new ResponseEntity<>(dtoAnios,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }
    }

    @PostMapping(path = "/poliza/new")
    public ResponseEntity<Object> savePoliza(@RequestBody DTOPoliza dtoPoliza, DTOMedidasDeSeguridad dtoMedidasDeSeguridad, List<DTOHijo> dtoHijos){
        try {
            gestorPoliza.darDeAltaPoliza(dtoPoliza, dtoMedidasDeSeguridad, dtoHijos);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
       /* Poliza poliza = modelMapper.map(dtoPoliza, Poliza.class);
        System.out.println(poliza.getNumeroDePoliza());
        gestorBaseDeDatos.savePoliza(poliza);
        Poliza poliza = gestorBaseDeDatos.findPolizaById(dtoPoliza.getNumeroDePoliza());
        //Type listDTOModelo = new TypeToken<List<DTOModelo>>() {}.getType();
        System.out.println(poliza);
        dtoPoliza = modelMapper.map(poliza, DTOPoliza.class);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoPoliza!=null) {
            return new ResponseEntity<>(dtoPoliza,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }*/
    }

    @GetMapping(path = "/cliente")
    @ResponseBody
    public ResponseEntity<Object> getCliente(@RequestParam(required = false) Integer id, @RequestParam(required = false) String apellido, @RequestParam(required = false) String nombre, @RequestParam(required = false) TipoDeDocumento tipoDeDocumento, @RequestParam(required = false) String numeroDeDocumento) {

        System.out.println();
        List<Cliente> clientes = gestorCliente.buscar(id, apellido, nombre, tipoDeDocumento, numeroDeDocumento);
        Type listDTOCliente = new TypeToken<List<DTOCliente>>(){}.getType();
        List<DTOCliente> dtoClientes = modelMapper.map(clientes, listDTOCliente);
        if(dtoClientes!=null) {
            return new ResponseEntity<>(dtoClientes,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/cliente/tiposDocumento")
    @ResponseBody
    public ResponseEntity<Object> getTiposDocumento(){
        List<String> tipos = gestorCliente.obtenerTiposDeDocumento();
        if(!tipos.isEmpty()){
            return new ResponseEntity<>(tipos, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/poliza")
    @ResponseBody
    public ResponseEntity<Object> getPoliza(String numeroDePoliza) {
        Poliza poliza = gestorPoliza.buscar(numeroDePoliza);
        DTOPoliza dtoPoliza = modelMapper.map(poliza, DTOPoliza.class);
        if(dtoPoliza!=null) {
            return new ResponseEntity<>(dtoPoliza,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/cuotas")
    @ResponseBody
    public ResponseEntity<Object> getCuotas(String numeroDePoliza) {
        List<Cuota> cuotas = gestorCuotas.buscarCuotasVigentes(numeroDePoliza);
        Type listDTOCuotas = new TypeToken<List<DTOCuota>>(){}.getType();
        List<DTOCuota> dtoCuotas = modelMapper.map(cuotas, listDTOCuotas);
        if(dtoCuotas!=null) {
            return new ResponseEntity<>(dtoCuotas,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

