package com.example.spring_jpa.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public  class Student {//PLAIN OLD JAVA OBJECT
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String cognoms;
    private LocalDate dataNeixement;

    private String grup;



    public Student() {//CONSTRUCTOR SENSE ARGUMENTS

    }

    public Student(long id, String nom, String cognoms, LocalDate dataNeixement, String grup) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNeixement = dataNeixement;
        this.grup = grup;
    }


    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
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

    public LocalDate getDataNeixement() {
        return dataNeixement;
    }

    public void setDataNeixement(LocalDate dataAlta) {
        this.dataNeixement = dataAlta;
    }



}
