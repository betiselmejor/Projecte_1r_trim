package com.example.spring_jpa.repositoris;

import com.example.spring_jpa.entitats.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentsRepositori extends CrudRepository<Student,Long> {


    public List<Student> findByGrup(String grup);




}
