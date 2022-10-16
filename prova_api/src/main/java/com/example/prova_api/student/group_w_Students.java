package com.example.prova_api.student;

import java.util.ArrayList;

public class group_w_Students {
    private String name;

    private ArrayList<Student> students=new ArrayList<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public group_w_Students(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void putStudents(ArrayList<Student> studentss){
        for (int i = 0; i<studentss.size();i++){
            if (studentss.get(i).getGrup().equals(this.name)){
                students.add(studentss.get(i));
            }
        }

    }

    public group_w_Students(String name) {
        this.name = name;
    }
}
