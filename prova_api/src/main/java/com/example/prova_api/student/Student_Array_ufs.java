package com.example.prova_api.student;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student_Array_ufs {

    private String nom;

    private String cognoms;

    private LocalDate data_neixement;

    private String ID;

    private String email;

    private ArrayList<UF_no_student_array> ufs;

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
        email= nom+cognoms+"@gmail.com";
    }

    public ArrayList<UF_no_student_array> getUfs() {
        return ufs;
    }

    public void setUfs(ArrayList<UF_no_student_array> ufs) {
        this.ufs = ufs;
    }

    public Student_Array_ufs(String nom, String cognoms, LocalDate data_neixement, String ID, String email, ArrayList<UF_no_student_array> ufs) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.email = email;
        this.ufs = ufs;
    }

    public Student_Array_ufs(String nom, String cognoms, LocalDate data_neixement, String ID, ArrayList<UF_no_student_array> ufs) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.ufs = ufs;
    }

    public Student_Array_ufs(String nom, String cognoms, LocalDate data_neixement, String ID) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
    }

    public Student_Array_ufs(String nom, String cognoms, LocalDate data_neixement, String ID, String email) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_neixement = data_neixement;
        this.ID = ID;
        this.email = email;
    }
}
