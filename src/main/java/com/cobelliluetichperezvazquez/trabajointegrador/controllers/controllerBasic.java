package com.cobelliluetichperezvazquez.trabajointegrador.controllers;


//Los controllers manejan las vistas (HTML)

import com.cobelliluetichperezvazquez.trabajointegrador.gestores.GestorBaseDeDatos;
import com.cobelliluetichperezvazquez.trabajointegrador.model.*;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.*;
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
    private ModelMapper modelMapper;

    @GetMapping(path = "/domicilio/{id}")
    public ResponseEntity<Object> getDomicilio(@RequestParam(value="id", defaultValue="0") int id){

        Domicilio dom = gestorBaseDeDatos.findDomicilioById(id);
        DTODomicilio dtoDomicilio = modelMapper.map(dom, DTODomicilio.class);

        if(dtoDomicilio!=null) {
            return new ResponseEntity<>(dtoDomicilio,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/cliente/{id}")
    public ResponseEntity<Object> getCliente(@RequestParam(value="id", defaultValue="0") int id){

        Cliente cliente = gestorBaseDeDatos.findClienteById(id);
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

    @GetMapping(path = "/domicilio/provincia/{id}/localidad")
    public ResponseEntity<Object> getLocalidad(@RequestParam(value="id", defaultValue="0") int idProvincia){

        List<Localidad> localidades = gestorBaseDeDatos.findAllLocalidadByProvincia(idProvincia);
        Type listType = new TypeToken<List<DTOLocalidad>>(){}.getType();
        List<DTOLocalidad> dtoLocalidades = modelMapper.map(localidades, listType);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoLocalidades!=null) {
            return new ResponseEntity<>(dtoLocalidades,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

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
    public ResponseEntity<Object> getModelosByMarca(@RequestParam(value = "id",defaultValue = "0") int id){

        List<Modelo> modelos = gestorBaseDeDatos.findAllModeloByMarca(id);
        Type listDTOModelo = new TypeToken<List<DTOModelo>>() {}.getType();
        List<DTOCobertura> dtoCoberturas = modelMapper.map(modelos, listDTOModelo);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoCoberturas!=null) {
            return new ResponseEntity<>(dtoCoberturas,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @GetMapping(path = "/poliza/{id}")
    public ResponseEntity<Object> getPoliza(@RequestParam(value = "id",defaultValue = "0") String id){

       Poliza poliza = gestorBaseDeDatos.findPolizaById(id);

        DTOPoliza dtoPoliza = modelMapper.map(poliza, DTOPoliza.class);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoPoliza!=null) {
            return new ResponseEntity<>(dtoPoliza,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }

    }

    @PostMapping(path = "/poliza/new")
    public ResponseEntity<Object> savePoliza(@RequestBody DTOPoliza dtoPoliza){

        System.out.println(dtoPoliza);
        Poliza poli = modelMapper.map(dtoPoliza, Poliza.class);
        System.out.println(poli.getNumeroDePoliza());
        gestorBaseDeDatos.savePoliza(poli);
        Poliza poliza = gestorBaseDeDatos.findPolizaById(dtoPoliza.getNumeroDePoliza());
        //Type listDTOModelo = new TypeToken<List<DTOModelo>>() {}.getType();
        System.out.println(poliza);
        dtoPoliza = modelMapper.map(poliza, DTOPoliza.class);

        //List<DTOCobertura> dtoCoberturas = modelMapper.map //map(coberturas, List.class);
        if(dtoPoliza!=null) {
            return new ResponseEntity<>(dtoPoliza,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }




    }


}
