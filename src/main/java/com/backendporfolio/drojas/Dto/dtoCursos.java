package com.backendporfolio.drojas.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoCursos {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public dtoCursos() {
    }

    public dtoCursos(String nombreE, String cursosE) {
        this.nombreE = nombreE;
        this.descripcionE = cursosE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
