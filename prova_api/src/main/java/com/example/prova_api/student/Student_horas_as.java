package com.example.prova_api.student;


import java.time.LocalDate;

public class Student_horas_as {
    private String nom;

    private String cognoms;

    private LocalDate data_neixement;

    private String ID;

    private int hores_assistides;

    private String percentatge;


    //////////////////////////////////////////////////////////////////


    public int getHores_assistides() {
        return hores_assistides;
    }

    public void setHores_assistides(int hores_assistides) {
        this.hores_assistides = hores_assistides;
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

    public String getPercentatge() {
        return percentatge;
    }

    public void setPercentatge(String percentatge) {
        this.percentatge = percentatge;
    }


    public void calcularpercentatge(UF uf, Student_horas_as student){
        String peprc;
        double hores_totals=Double.valueOf(uf.getHores_totals());
        double hores_ass=Double.valueOf(student.getHores_assistides());

        double perc = (hores_ass/ hores_totals)*100;
        peprc = String.valueOf(perc)+"%";



        setPercentatge(peprc);


    }

    public Student_horas_as(String nom, String cognoms, LocalDate data_neixement, String ID, int hores_assistides) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.hores_assistides = hores_assistides;

    }

    public Student_horas_as(String nom, String cognoms, LocalDate data_neixement, String ID) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
    }

    public Student_horas_as(String nom, String cognoms, LocalDate data_neixement, String ID, int hores_assistides, String percentatge) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.hores_assistides = hores_assistides;
        this.percentatge = percentatge;
    }
}