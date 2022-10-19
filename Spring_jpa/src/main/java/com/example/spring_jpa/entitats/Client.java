package com.example.spring_jpa.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Client {//PLAIN OLD JAVA OBJECT
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String cognoms;
    private LocalDate dataAlta;

    public Client() {//CONSTRUCTOR SENSE ARGUMENTS

    }

    public Client(String nom, String cognoms, LocalDate dataAlta) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataAlta = dataAlta;
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

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }
}
