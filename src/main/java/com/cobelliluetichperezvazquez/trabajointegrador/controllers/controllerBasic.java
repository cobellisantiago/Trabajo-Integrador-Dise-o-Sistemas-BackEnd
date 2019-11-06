package com.cobelliluetichperezvazquez.trabajointegrador.controllers;


//Los controllers manejan las vistas (HTML)

import com.cobelliluetichperezvazquez.trabajointegrador.gestores.GestorBaseDeDatos;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Dtos.DTODomicilio;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Localidad;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Pais;
import com.cobelliluetichperezvazquez.trabajointegrador.model.Provincia;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class controllerBasic {

    @Autowired
    private GestorBaseDeDatos gestorBaseDeDatos;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping(path = "/domicilio/{id}")
    public ResponseEntity<Object> saludar(){


        Localidad localidad = gestorBaseDeDatos.findLocalidadById(0);
        Domicilio domicilio = new Domicilio(1,"las heras",3554,0,'-',3000,localidad);
        System.out.println(gestorBaseDeDatos.saveDomicilio(domicilio));
        Domicilio dom = gestorBaseDeDatos.findDomicilioById(7);
        System.out.println(dom);

        DTODomicilio dtoDomicilio = modelMapper.map(domicilio, DTODomicilio.class);
        System.out.println(dtoDomicilio);
        if(dtoDomicilio!=null) {
            return new ResponseEntity<>(dtoDomicilio,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//RecordNotFoundException("No employee record exist for given id");
        }



    }

//    public ResponseEntity<Object> GetPoliza(@RequestBody Employee employee)
//    {
//        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//        employee.setId(id);
//
//        employeeDao.addEmployee(employee);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(employee.getId())
//                .toUri();
//
//        return ResponseEntity.created(location).build();
//    }

}
