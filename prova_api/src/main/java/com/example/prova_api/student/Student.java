package com.example.prova_api.student;


import java.time.LocalDate;

public class Student {
    private String nom;
    private String cognoms;
    private LocalDate data;

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

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

    public Student(String nom, String cognoms, LocalDate data) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data = data;
    }
}

