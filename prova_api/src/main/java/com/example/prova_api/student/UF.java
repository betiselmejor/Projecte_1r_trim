package com.example.prova_api.student;

import java.util.ArrayList;

public class UF {
    private int hores_totals;

    private String nom;


    private ArrayList<Student_horas_as> students ;


    public ArrayList<Student_horas_as> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student_horas_as> students) {
        this.students = students;
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


    public UF(int hores_totals, String nom, ArrayList<Student_horas_as> students) {
        this.hores_totals = hores_totals;
        this.nom = nom;
        this.students = students;
    }

    public UF(int hores_totals, String nom) {
        this.hores_totals = hores_totals;
        this.nom = nom;
    }
}