package com.example.boleteria.controller;

import com.example.boleteria.interfaces.EventoRepository;
import com.example.boleteria.model.Cliente;
import com.example.boleteria.model.Evento;
import com.example.boleteria.model.Sala;
import jdk.jfr.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {

    Logger log = LoggerFactory.getLogger(getClass());
 
    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Evento findEvento(@PathVariable Long id){
        return eventoRepository.findById(id).orElseThrow();
    }

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Evento> findAll(){
        return this.eventoRepository.findAll();
    }

}
