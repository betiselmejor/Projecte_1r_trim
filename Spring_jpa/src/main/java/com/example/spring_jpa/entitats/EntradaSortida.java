package com.example.spring_jpa.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class EntradaSortida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomAula;
    private long idAlumne;
    private LocalDate dia;
    private LocalTime entrada;
    private LocalTime salida;

    public EntradaSortida() {
    }

    public EntradaSortida(long id, String nomAula, long idAlumne, LocalDate dia, LocalTime entrada, LocalTime salida) {
        this.id = id;
        this.nomAula = nomAula;
        this.idAlumne = idAlumne;
        this.dia = dia;
        this.entrada = entrada;
        this.salida = salida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomAula() {
        return nomAula;
    }

    public void setNomAula(String nomAula) {
        this.nomAula = nomAula;
    }

    public long getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(long idAlumne) {
        this.idAlumne = idAlumne;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }
}
