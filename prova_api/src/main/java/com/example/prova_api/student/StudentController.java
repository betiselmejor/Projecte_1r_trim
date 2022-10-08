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

    //LLISTA DE TOTS ELS ALUMNES
    @GetMapping (path = "/student_list")// aquest es un dels punts de restcontroller
    public List<Student> getStudents() {
        ArrayList<Student> students= new ArrayList<>();

        students.add(new Student("Joana","Petita", LocalDate.of(2000, Month.MARCH,22),"M1","UF1","12345678A",20,19,90,50));
        students.add(new Student("Joan","Petit",LocalDate.of(2000,Month.MARCH,23),"M1","UF1","12345678B",20,10,90,50));
        students.add(new Student("Marina","Moreno",LocalDate.of(1995,Month.JANUARY,19),"M1","UF2","12345678C",40,40,110,40));
        students.add(new Student("Ivan","Gallego",LocalDate.of(2003,Month.OCTOBER,1),"M1","UF2","12345678D",40,25,110,60));
        students.add(new Student("Pol","Pou",LocalDate.of(1998,Month.JULY,12),"M2","UF1","12345678E",20,5,70,70));
        students.add(new Student("Maria","Parras",LocalDate.of(1997,Month.AUGUST,6),"M2","UF1","12345678F",20,20,70,50));
        students.add(new Student("Laura","Perez",LocalDate.of(2002,Month.DECEMBER,8),"M3","UF1","12345678G",16,16,16,16));

        return students;
    }


    //MOSTRAR ELS IDS
    @GetMapping(path = "/IDS")
    public ArrayList<Student> IDS(){
        ArrayList<Student> students = (ArrayList<Student>) getStudents();

        ArrayList<Student> IDS = new ArrayList<Student>();

        for (int i = 0; i< students.size();i++){
            IDS.add(new Student(students.get(i).getNom(),students.get(i).getCognoms(),students.get(i).getID()));
        }

        return IDS;

    }

    //FALTES D'UN MODUL
    @GetMapping (path = "/M1")
        public ArrayList<Student> F_M1(){
            ArrayList<Student> students = (ArrayList<Student>) getStudents();

            ArrayList<Student> FALTESM1 = new ArrayList<Student>();

            for (int i = 0; i< students.size();i++) {
                if (students.get(i).getModul() == "M1") {
                    FALTESM1.add(new Student(students.get(i).getNom(),
                            students.get(i).getCognoms(),
                            students.get(i).getModul(),
                            students.get(i).getID(),
                            students.get(i).getHores_totals_Modul(),
                            students.get(i).getHores_asistides_Modul(),
                            students.get(i).getPercentatge_modul()));
                }
            }
            return FALTESM1;

        }

        //MOSTRAR LES FALTES D'UNA UF
    @GetMapping(path = "/M1/UF1")
    public ArrayList<Student> F_M1_UF1(){
        ArrayList<Student> students = (ArrayList<Student>) getStudents();

        ArrayList<Student> FALTESUF1 = new ArrayList<Student>();

        for (int i = 0; i< students.size();i++) {
            if (students.get(i).getModul() == "M1" && students.get(i).getUF() == "UF1") {
                FALTESUF1.add(new Student(students.get(i).getNom(),
                        students.get(i).getCognoms(),
                        students.get(i).getModul(),
                        students.get(i).getUF(),
                        students.get(i).getID(),
                        students.get(i).getHores_totals_UF(),
                        students.get(i).getHores_asistides_UF(),
                        students.get(i).getPercentatge_uf()));
            }
        }
        return FALTESUF1;

    }

    //MOSTRAR NOMES UN ALUMNE
    @GetMapping(path = "/12345678F")
    public ArrayList <Student> F_1_A(){
        ArrayList<Student> students = (ArrayList<Student>) getStudents();
        ArrayList<Student> persona_id = new ArrayList<Student>();

        for (int i = 0; i< students.size();i++) {
            if (students.get(i).getID()=="12345678F") {
                persona_id.add(students.get(i));
            }
        }
        return persona_id;

    }



    //MOSTRAR NOMES ELS NOMS
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
