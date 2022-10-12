package com.example.prova_api.student;

import java.util.ArrayList;

public class modul {
    private String nom;

    private int horestotals;

    private ArrayList<UF> ufs;



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHorestotals() {
        return horestotals;
    }

    public void setHorestotals(int horestotals) {
        this.horestotals = horestotals;
    }

    public ArrayList<UF> getUfs() {
        return ufs;
    }

    public void setUfs(ArrayList<UF> ufs) {
        this.ufs = ufs;
    }





    public modul(String nom, int horestotals, ArrayList<UF> ufs) {
        this.nom = nom;
        this.horestotals = horestotals;
        this.ufs = ufs;
    }
}