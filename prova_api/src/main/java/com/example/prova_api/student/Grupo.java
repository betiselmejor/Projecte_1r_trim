package com.example.prova_api.student;

public class Grupo {
    private String nombre;
    private String aula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Grupo(String nombre, String aula) {
        this.nombre = nombre;
        this.aula = aula;
    }
}
