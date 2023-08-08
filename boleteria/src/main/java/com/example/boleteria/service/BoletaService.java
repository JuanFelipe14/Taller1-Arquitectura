package com.example.boleteria.service;

import com.example.boleteria.interfaces.BoletaRepository;
import com.example.boleteria.model.Boleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaService {

    @Autowired
    private BoletaRepository boletaRepository;

    public List<Boleta> listarBoletas(){
        return boletaRepository.findAll();
    }

}
