package com.example.boleteria.controller;

import com.example.boleteria.interfaces.SalaRepository;
import com.example.boleteria.model.Cliente;
import com.example.boleteria.model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {
    @Autowired
    SalaRepository salaRepository;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Sala findSala(@PathVariable Long id){
        return salaRepository.findById(id).orElseThrow();
    }

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Sala> findAll(){
        return this.salaRepository.findAll();
    }
}
