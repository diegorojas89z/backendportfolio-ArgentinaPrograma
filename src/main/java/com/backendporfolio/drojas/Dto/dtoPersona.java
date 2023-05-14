package com.backendporfolio.drojas.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String cargoactual;
    @NotBlank
    private String img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String cargoactual, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.cargoactual = cargoactual;
        this.img = img;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getCargoactual() {
        return cargoactual;
    }

    public void setCargoactual(String cargoactual) {
        this.cargoactual = cargoactual;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}
