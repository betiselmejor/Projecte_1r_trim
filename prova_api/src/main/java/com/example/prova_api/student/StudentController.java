package com.example.prova_api.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")//el path per accedir ja no sera localhost 8080 si no que a mes afegim aixo per a poder entrar a la clase
public class StudentController {

    @GetMapping (path = "/student_list")// aquest es un dels punts de restcontroller
    public List<Student> getStudents() {
        ArrayList<Student> students= new ArrayList<>();

        students.add(new Student("Joana","Petita", LocalDate.of(2000, Month.MARCH,22)));
        students.add(new Student("Joan","Petit",LocalDate.of(2000,Month.MARCH,23)));
        students.add(new Student("Marina","Moreno",LocalDate.of(1995,Month.JANUARY,19)));
        students.add(new Student("Ivan","Gallego",LocalDate.of(2003,Month.OCTOBER,1)));
        students.add(new Student("Pol","Pou",LocalDate.of(1998,Month.JULY,12)));
        students.add(new Student("Maria","Parras",LocalDate.of(1997,Month.AUGUST,6)));
        students.add(new Student("Laura","Perez",LocalDate.of(2002,Month.DECEMBER,8)));

        return students;
    }


    @GetMapping(path = "/student1")
    public Student student1(){
        ArrayList<Student> students = (ArrayList<Student>) getStudents();

        return students.get(0);

    }

    @GetMapping(path = "/names")
    public List<String> names(){
        ArrayList<Student> students = (ArrayList<Student>) getStudents();
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i< students.size();i++){
            names.add(students.get(i).getNom());
        }

        return names;
    }

}
