package com.example.prova_api.student;

public class UF_no_student_array {
    private int hores_totals;

    private String nom;

    private int hores_assistides;

    private String percentatge;

    public int getHores_assistides() {
        return hores_assistides;
    }

    public void setHores_assistides(int hores_assistides) {
        this.hores_assistides = hores_assistides;
    }

    public String getPercentatge() {
        return percentatge;
    }

    public void setPercentatge(String percentatge) {
        this.percentatge = percentatge;
    }

    public int getHores_totals() {
        return hores_totals;
    }

    public void setHores_totals(int hores_totals) {
        this.hores_totals = hores_totals;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public UF_no_student_array(int hores_totals, String nom) {
        this.hores_totals = hores_totals;
        this.nom = nom;
    }

    public UF_no_student_array(int hores_totals, String nom, int hores_assistides, String percentatge) {
        this.hores_totals = hores_totals;
        this.nom = nom;
        this.hores_assistides = hores_assistides;
        this.percentatge = percentatge;
    }
}
