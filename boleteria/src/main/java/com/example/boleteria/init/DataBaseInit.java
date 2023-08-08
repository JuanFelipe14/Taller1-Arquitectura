package com.example.boleteria.init;

import com.example.boleteria.interfaces.BoletaRepository;
import com.example.boleteria.interfaces.ClienteRepository;
import com.example.boleteria.interfaces.EventoRepository;
import com.example.boleteria.interfaces.SalaRepository;
import com.example.boleteria.model.Boleta;
import com.example.boleteria.model.Cliente;
import com.example.boleteria.model.Evento;
import com.example.boleteria.model.Sala;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class DataBaseInit implements CommandLineRunner {

    @Autowired
    private BoletaRepository boletaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private SalaRepository salaRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        boletaRepository.save(new Boleta(1,45,15));
        boletaRepository.save(new Boleta(2,46,15));
        boletaRepository.save(new Boleta(3,47,17));

        clienteRepository.save(new Cliente(5,"Felipe","Arias","felipe@hotmail.com",123,456));

        Date fechaInicio = new Date(2023,3,2);
        Date fechaFinal = new Date(2023,6,20);

        List<Sala> listaSalas = new ArrayList<>();

        Sala sala1 = new Sala(15,"A",74);
        Sala sala2 = new Sala(15,"B",8);
        Sala sala3 = new Sala(17,"C",24);

        listaSalas.add(sala1);
        listaSalas.add(sala2);
        listaSalas.add(sala3);

        salaRepository.save(sala1);
        salaRepository.save(sala2);
        salaRepository.save(sala3);

        eventoRepository.save(new Evento(6,"Batalla de boyaca",fechaInicio,fechaFinal,listaSalas));

        Date fechaInicio2 = new Date(2023,6,4);
        Date fechaFinal2 = new Date(2023,12,10);

        Sala sala4 = new Sala(30,"D",54);
        Sala sala5 = new Sala(1535,"E",16);
        Sala sala6 = new Sala(34,"F",48);

        List<Sala> listaSalas2 = new ArrayList<>();

        salaRepository.save(sala4);
        salaRepository.save(sala5);
        salaRepository.save(sala6);

        listaSalas2.add(sala4);
        listaSalas2.add(sala5);
        listaSalas2.add(sala6);

        eventoRepository.save(new Evento(7,"Independencia",fechaInicio2,fechaFinal2,listaSalas2));

    }
}
