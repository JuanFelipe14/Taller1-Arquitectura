package com.example.boleteria.service;

import com.example.boleteria.interfaces.EventoRepository;
import com.example.boleteria.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> listarEventos(){
        return eventoRepository.findAll();
    }
}
