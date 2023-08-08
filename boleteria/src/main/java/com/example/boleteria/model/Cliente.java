package com.example.boleteria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue
    Long id;

    Integer codigo;
    String nombre;
    String apellido;
    String correo;
    Integer cedula;
    Integer celular;

    @OneToMany
    List<Boleta> listaBoletas;

    public Cliente() {
    }

    public Cliente(Integer codigo, String nombre, String apellido, String correo, Integer cedula, Integer celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cedula = cedula;
        this.celular = celular;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public List<Boleta> getListaBoletas() {
        return listaBoletas;
    }

    public void setListaBoletas(List<Boleta> listaBoletas) {
        this.listaBoletas = listaBoletas;
    }
}
