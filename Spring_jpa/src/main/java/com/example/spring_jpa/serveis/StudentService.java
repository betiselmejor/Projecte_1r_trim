package com.example.spring_jpa.serveis;

import com.example.spring_jpa.entitats.Student;
import com.example.spring_jpa.repositoris.StudentsRepositori;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentsRepositori studentsRepositori;


    public StudentService(StudentsRepositori studentsRepositori) {
        this.studentsRepositori = studentsRepositori;
    }


    public  List<Student> getStudentsByGrup(String grup) {
        return studentsRepositori.findByGrup(grup);
    }


}
