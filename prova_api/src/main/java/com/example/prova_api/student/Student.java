package com.example.prova_api.student;


import java.time.LocalDate;

public class Student {
    private String nom;
    private String cognoms;
    private LocalDate data;

    private String Modul;

    private String UF;

    private String ID;

    private int hores_totals_UF;
    private int hores_asistides_UF;

    private int hores_totals_Modul;
    private int hores_asistides_Modul;

    private String percentatge_modul;

    private String percentatge_uf;

    public String getPercentatge_modul() {
        return percentatge_modul;
    }

    public void setPercentatge_modul(String percentatge_modul) {
        this.percentatge_modul = percentatge_modul;
    }

    public String getPercentatge_uf() {
        return percentatge_uf;
    }

    public void setPercentatge_uf(String percentatge_uf) {
        this.percentatge_uf = percentatge_uf;
    }

    public String getModul() {
        return Modul;
    }

    public int getHores_totals_UF() {
        return hores_totals_UF;
    }

    public void setHores_totals_UF(int hores_totals_UF) {
        this.hores_totals_UF = hores_totals_UF;
    }

    public int getHores_asistides_UF() {
        return hores_asistides_UF;
    }

    public void setHores_asistides_UF(int hores_asistides_UF) {
        this.hores_asistides_UF = hores_asistides_UF;
    }

    public int getHores_totals_Modul() {
        return hores_totals_Modul;
    }

    public void setHores_totals_Modul(int hores_totals_Modul) {
        this.hores_totals_Modul = hores_totals_Modul;
    }

    public int getHores_asistides_Modul() {
        return hores_asistides_Modul;
    }

    public void setHores_asistides_Modul(int hores_asistides_Modul) {
        this.hores_asistides_Modul = hores_asistides_Modul;
    }

    public void setModul(String modul) {
        Modul = modul;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
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

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



    public String  percentatje_faltes(int hores_totals, int hores_asistides){
    double total=  hores_totals;
    double ass=hores_asistides;
    double perc =ass/total;


    return perc*100+"%";

    }



    public Student(String nom, String cognoms, LocalDate data) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data = data;
    }

    public Student(String nom, String cognoms, LocalDate data, String modul, String UF) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data = data;
        Modul = modul;
        this.UF = UF;
    }

    public Student(String nom, String cognoms, LocalDate data, String modul, String UF, String ID, int hores_totals_UF, int hores_asistides_UF, int hores_totals_Modul, int hores_asistides_Modul) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data = data;
        Modul = modul;
        this.UF = UF;
        this.ID = ID;
        this.hores_totals_UF = hores_totals_UF;
        this.hores_asistides_UF = hores_asistides_UF;
        this.hores_totals_Modul = hores_totals_Modul;
        this.hores_asistides_Modul = hores_asistides_Modul;
    }

    //CONSTRUCOTR AMB NOM , COGNOM, MODUL, ID , HORES MODUL, HORESA ASISTIDES MODUL
    public Student(String nom, String cognoms, String modul, String ID, int hores_totals_Modul, int hores_asistides_Modul,String percentatge_modul) {
        this.nom = nom;
        this.cognoms = cognoms;
        Modul = modul;
        this.ID = ID;
        this.hores_totals_Modul = hores_totals_Modul;
        this.hores_asistides_Modul = hores_asistides_Modul;
        this.percentatge_modul= percentatje_faltes(hores_totals_Modul,hores_asistides_Modul);
    }

    //CONSTTRUCTOR NOM // COGNOM // MODUL // UF // ID // HORES TOTALS UF // HORES ASISRIDES // PERCENTATGE
    public Student(String nom, String cognoms, String modul, String UF, String ID, int hores_totals_UF, int hores_asistides_UF, String percentatge_uf) {
        this.nom = nom;
        this.cognoms = cognoms;
        Modul = modul;
        this.UF = UF;
        this.ID = ID;
        this.hores_totals_UF = hores_totals_UF;
        this.hores_asistides_UF = hores_asistides_UF;
        this.percentatge_uf = percentatje_faltes(hores_totals_UF,hores_asistides_UF);
    }

    public Student(String nom, String cognoms, LocalDate data, String modul, String UF, String ID, int hores_totals_UF, int hores_asistides_UF, int hores_totals_Modul, int hores_asistides_Modul, String percentatge_modul, String percentatge_uf) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.data = data;
        Modul = modul;
        this.UF = UF;
        this.ID = ID;
        this.hores_totals_UF = hores_totals_UF;
        this.hores_asistides_UF = hores_asistides_UF;
        this.hores_totals_Modul = hores_totals_Modul;
        this.hores_asistides_Modul = hores_asistides_Modul;
        this.percentatge_modul = percentatje_faltes(hores_totals_Modul,hores_asistides_Modul);
        this.percentatge_uf = percentatje_faltes(hores_totals_UF,hores_asistides_UF);
    }

    public Student(String nom, String cognoms, String ID) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.ID = ID;
    }
}

