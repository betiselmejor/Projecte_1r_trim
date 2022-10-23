package com.example.spring_jpa.controller;


import com.example.spring_jpa.entitats.Cicles;
import com.example.spring_jpa.entitats.Student;


import com.example.spring_jpa.repositoris.CiclesRepositori;
import com.example.spring_jpa.repositoris.StudentsRepositori;


import com.example.spring_jpa.serveis.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class studentscontroller {

    @Autowired
    StudentsRepositori studentsRep;//No cal fer new
    @Autowired
    CiclesRepositori ciclesRep;


    @Autowired
    StudentService studentserv= new StudentService(studentsRep);


    /*UN ESTUDIANT PEL SEU ID*/@GetMapping("students/IDS/{id}")
    public Student getstudentbyid(@PathVariable long id){
       Student student1 = studentsRep.findById(id).get();
       return student1;

    }


   /*TOTS ELS ESTUDIANTS*/ @GetMapping("students")
    public List<Student> getstudents(){

       return (List<Student>) studentsRep.findAll();

    }

   /*TOTS ELS CICLES*/ @GetMapping("cicles")
    public List<Cicles> getcicles(){

        return (List<Cicles>) ciclesRep.findAll();

    }


    /*TOTS ELS ESTUDIANTS D'UN GRUP*/@RequestMapping ("students/GRUPS/{grup}")
    public List<Student> getStudentByGroup (@PathVariable String grup){
       return studentserv.getStudentsByGrup(grup);
    }





}
