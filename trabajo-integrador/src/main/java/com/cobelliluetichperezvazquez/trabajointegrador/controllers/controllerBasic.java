package com.cobelliluetichperezvazquez.trabajointegrador.controllers;


//Los controllers manejan las vistas (HTML)

import com.cobelliluetichperezvazquez.trabajointegrador.model.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/hola")
public class controllerBasic {

    @Autowired
    @Qualifier("DomicilioRepository")
    private DomicilioRepository domicilioRepository;

    @GetMapping(path = "/saludar")
    public String saludar(){
        return "Buenos dias";
    }


    @PostMapping(path="domicilio")
    public boolean AltaNota(@RequestBody @Valid Domicilio domicilio){

    }
}
