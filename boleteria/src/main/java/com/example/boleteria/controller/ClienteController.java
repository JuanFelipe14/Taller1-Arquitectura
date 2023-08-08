package com.example.boleteria.controller;

import com.example.boleteria.interfaces.ClienteRepository;
import com.example.boleteria.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Cliente findCliente(@PathVariable Long id){
        return clienteRepository.findById(id).orElseThrow();
    }
}
