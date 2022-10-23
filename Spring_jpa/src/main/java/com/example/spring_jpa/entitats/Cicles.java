package com.example.spring_jpa.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public  class Cicles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String grups;

    private String aula;

    public Cicles() {
    }

    public Cicles(long id, String nom, String grups, String aula) {
        this.id = id;
        this.nom = nom;
        this.grups = grups;
        this.aula = aula;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrups() {
        return grups;
    }

    public void setGrups(String grups) {
        this.grups = grups;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
