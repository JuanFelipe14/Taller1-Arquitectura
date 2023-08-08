package com.example.boleteria.service;

import com.example.boleteria.interfaces.SalaRepository;
import com.example.boleteria.model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> listarSalas(){
        return salaRepository.findAll();
    }
}
