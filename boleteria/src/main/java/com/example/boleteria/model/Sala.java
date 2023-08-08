package com.example.boleteria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sala {

    @Id
    @GeneratedValue
    Long id;

    Integer codigoSala;
    String nombre;
    Integer aforo;

    public Sala() {
    }

    public Sala(Integer codigoSala, String nombre, Integer aforo) {
        this.codigoSala = codigoSala;
        this.nombre = nombre;
        this.aforo = aforo;
    }

    public Integer getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(Integer codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }
}

