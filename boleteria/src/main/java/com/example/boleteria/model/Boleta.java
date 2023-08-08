package com.example.boleteria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Boleta {
    @Id
    @GeneratedValue
    Long id;

    Integer numeroBoleta;
    Integer codigoCliente;
    Integer codigoSala;

    public Boleta() {
    }

    public Boleta(Integer numeroBoleta, Integer codigoCliente, Integer codigoSala) {
        this.numeroBoleta = numeroBoleta;
        this.codigoCliente = codigoCliente;
        this.codigoSala = codigoSala;
    }

    public Integer getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(Integer numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(Integer codigoSala) {
        this.codigoSala = codigoSala;
    }
}
