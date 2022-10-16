package com.example.prova_api.student;

import java.util.ArrayList;

public class Ciclo {
    private String nom;

    //arraylist de grupos
    private ArrayList<Grupo> grupos;




    public String getNom() { return nom; }


    public void setNom(String nom) { this.nom = nom; }


    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Ciclo(String nom, ArrayList<Grupo> grupos) {
        this.nom = nom;
        this.grupos = grupos;
    }
}
