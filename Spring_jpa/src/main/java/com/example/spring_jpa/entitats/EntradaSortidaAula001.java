package com.example.spring_jpa.entitats;

import java.time.LocalTime;

public class EntradaSortidaAula001 {

    private  String nomaula;
    private Long idAlumne;

    private LocalTime entrada;

    private LocalTime sortida;


    public EntradaSortidaAula001(Long idAlumne, LocalTime entrada, LocalTime sortida) {
        this.idAlumne = idAlumne;
        this.entrada = entrada;
        this.sortida = sortida;
    }


    public EntradaSortidaAula001() {
    }


    public Long getIdAlumne() {
        return idAlumne;
    }

    public void setIdAlumne(Long idAlumne) {
        this.idAlumne = idAlumne;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSortida() {
        return sortida;
    }

    public void setSortida(LocalTime sortida) {
        this.sortida = sortida;
    }
}
