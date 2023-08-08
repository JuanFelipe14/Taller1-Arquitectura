package com.example.boleteria.controller;

import com.example.boleteria.interfaces.BoletaRepository;
import com.example.boleteria.model.Boleta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/boleta")
public class BoletaController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    BoletaRepository boletaRepository;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Boleta findBoleta(@PathVariable Long id){
        return boletaRepository.findById(id).orElseThrow();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("")
    public void saveBoleta(@RequestBody Boleta boleta){
        log.info("**** {}",boleta.getNumeroBoleta());
    }
    
}
