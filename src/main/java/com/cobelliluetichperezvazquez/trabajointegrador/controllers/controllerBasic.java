package com.cobelliluetichperezvazquez.trabajointegrador.controllers;


//Los controllers manejan las vistas (HTML)

import com.cobelliluetichperezvazquez.trabajointegrador.gestores.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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



}
