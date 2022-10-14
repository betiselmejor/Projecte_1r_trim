package com.example.prova_api.student;


import java.time.LocalDate;

public class Student {
    private String nom;

    private String cognoms;

    private LocalDate data_neixement;

    private String ID;

    private String email;

    private String grup;


    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
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

    public LocalDate getData_neixement() {
        return data_neixement;
    }

    public void setData_neixement(LocalDate data_neixement) {
        this.data_neixement = data_neixement;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        email= nom+cognoms+"@gmail.com";    }

    public Student(String nom, String cognoms, LocalDate data_neixement, String ID) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
    }

    public Student(String nom, String cognoms, LocalDate data_neixement, String ID, String grup) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.grup = grup;
    }
}

