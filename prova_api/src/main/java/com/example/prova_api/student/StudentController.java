package com.example.prova_api.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")//el path per accedir ja no sera localhost 8080 si no que a mes afegim aixo per a poder entrar a la clase
public class StudentController {


    //Aqui tindrem afegirem totes les ufs del modul2
    public ArrayList<UF> getUfs_M2() {
        //Creamos arraylist de ufs
        ArrayList<UF> ufs = new ArrayList<>();


        //Importamos los estudiantes creados con el metodo getstudent()
        ArrayList<Student> students = new ArrayList<>();
        students = getStudents();


        /*Creamos 3 arrayList, una por cada UF que tendra el modulo, el obeto de la arraylist es Student_horas_as porque en
        la clase Student no estan los campos ni de horas asistidas ni de porcentaje de clases asistidas*/
        ArrayList<Student_horas_as> students_h0 = new ArrayList<>();
        ArrayList<Student_horas_as> students_h1 = new ArrayList<>();
        ArrayList<Student_horas_as> students_h2 = new ArrayList<>();


        /*Creamos la UF1 le ponemos el nombre M2_UF1 pasandole solo el nombre y las horas totales de la UF
        ya que mas tarde le añadiremos la arraylist de alumnos que estan dentro de la UF*/
        UF M2_UF1 = new UF(20, "M2_UF1");


        /*En este for lo que estamos haciendo es recojer todos los datos de los alumnos ya creados anteriormente
         * que los hemos importado en la arraylist students, i le añadimos las horas asistidas ya que en la clase Student normal no tenemos ese campo*/
        for (int i = 0; i < students.size(); i++) {
            students_h0.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    10

            ));
            /*Calculamos con el metodo calcularpercentatge el porcentaje de las horas que ha asistido el alumno
             * pasandole por una parte la UF a la que le hemos introducido para que sepa las horas totales
             * i el mismo alumno para que sepa las horas asistidas*/
            students_h0.get(i).calcularpercentatge(M2_UF1, students_h0.get(i));

        }
        /*Añadimos a la UF1 del M2 la lista de alumnos que le tocan*/
        M2_UF1.setStudents(students_h0);


        UF M2_UF2 = new UF(20, "M2_UF2");
        for (int i = 0; i < students.size(); i++) {
            students_h1.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    15

            ));
            students_h1.get(i).calcularpercentatge(M2_UF2, students_h1.get(i));
        }
        M2_UF2.setStudents(students_h1);


        UF M2_UF3 = new UF(20, "M2_UF3");

        for (int i = 0; i < students.size(); i++) {
            students_h2.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    19

            ));
            students_h2.get(i).calcularpercentatge(M2_UF3, students_h2.get(i));
        }
        M2_UF3.setStudents(students_h2);


        //Añadimos las 3 UFS al arraylist ufs creado anteriormente
        ufs.add(M2_UF1);
        ufs.add(M2_UF2);
        ufs.add(M2_UF3);

        //retornamos el arraylist ufs
        return ufs;

    }


    //Aqui afegirem les ufs del modul1
    public ArrayList<UF> getUfs_M1() {
        //Creamos arraylist de ufs
        ArrayList<UF> ufs = new ArrayList<>();


        //Importamos los estudiantes creados con el metodo getstudent()
        ArrayList<Student> students = new ArrayList<>();
        students = getStudents();


        /*Creamos 3 arrayList, una por cada UF que tendra el modulo, el obeto de la arraylist es Student_horas_as porque en
        la clase Student no estan los campos ni de horas asistidas ni de porcentaje de clases asistidas*/
        ArrayList<Student_horas_as> students_h0 = new ArrayList<>();
        ArrayList<Student_horas_as> students_h1 = new ArrayList<>();
        ArrayList<Student_horas_as> students_h2 = new ArrayList<>();


        /*Creamos la UF1 le ponemos el nombre M2_UF1 pasandole solo el nombre y las horas totales de la UF
        ya que mas tarde le añadiremos la arraylist de alumnos que estan dentro de la UF*/
        UF M1_UF1 = new UF(20, "M1_UF1");


        /*En este for lo que estamos haciendo es recojer todos los datos de los alumnos ya creados anteriormente
         * que los hemos importado en la arraylist students, i le añadimos las horas asistidas ya que en la clase Student normal no tenemos ese campo*/
        for (int i = 0; i < students.size(); i++) {
            students_h0.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    10

            ));
            /*Calculamos con el metodo calcularpercentatge el porcentaje de las horas que ha asistido el alumno
             * pasandole por una parte la UF a la que le hemos introducido para que sepa las horas totales
             * i el mismo alumno para que sepa las horas asistidas*/
            students_h0.get(i).calcularpercentatge(M1_UF1, students_h0.get(i));

        }
        /*Añadimos a la UF1 del M2 la lista de alumnos que le tocan*/
        M1_UF1.setStudents(students_h0);


        UF M1_UF2 = new UF(20, "M1_UF2");
        for (int i = 0; i < students.size(); i++) {
            students_h1.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    15

            ));
            students_h1.get(i).calcularpercentatge(M1_UF2, students_h1.get(i));
        }
        M1_UF2.setStudents(students_h1);


        UF M1_UF3 = new UF(20, "M1_UF3");

        for (int i = 0; i < students.size(); i++) {
            students_h2.add(new Student_horas_as(
                    students.get(i).getNom(),
                    students.get(i).getCognoms(),
                    students.get(i).getData_neixement(),
                    students.get(i).getID(),
                    19

            ));
            students_h2.get(i).calcularpercentatge(M1_UF3, students_h2.get(i));
        }
        M1_UF3.setStudents(students_h2);


        //Añadimos las 3 UFS al arraylist ufs creado anteriormente
        ufs.add(M1_UF1);
        ufs.add(M1_UF2);
        ufs.add(M1_UF3);

        //retornamos el arraylist ufs
        return ufs;

    }



    public ArrayList<UF> getUfs(){
        ArrayList<UF> ufs1= getUfs_M1();
        ArrayList<UF> ufs2=getUfs_M2();

        ArrayList<UF> ufs_t= new ArrayList<>();

        ufs_t.addAll(ufs1);
        ufs_t.addAll(ufs2);


        return ufs_t;
    }


    //LLISTA DE TOTS ELS ALUMNES
    @GetMapping(path = "/student_list")// aquest es un dels punts de restcontroller
    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Joana", "Petita", LocalDate.of(2000, Month.MARCH, 22), "12345678A","DAM1"));
        students.add(new Student("Joan", "Petit", LocalDate.of(2000, Month.MARCH, 23), "12345678B","DAM2"));
        students.add(new Student("Marina", "Moreno", LocalDate.of(1995, Month.JANUARY, 19), "12345678C","DAW1"));
        students.add(new Student("Ivan", "Gallego", LocalDate.of(2003, Month.OCTOBER, 1), "12345678D","DAW2"));
        students.add(new Student("Pol", "Pou", LocalDate.of(1998, Month.JULY, 12), "12345678E","SMIX1"));
        students.add(new Student("Maria", "Parras", LocalDate.of(1997, Month.AUGUST, 6), "12345678F","SMIX2"));
        students.add(new Student("Laura", "Perez", LocalDate.of(2002, Month.DECEMBER, 8), "12345678G","ASIX1"));
        students.add(new Student("Lorena", "Gutierrez", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","ASIX2"));
        students.add(new Student("Lola", "Lolita", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","ASIX1"));
        students.add(new Student("Paula", "Costa", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","DAM1"));
        students.add(new Student("Janna", "Garcia", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","DAM2"));
        students.add(new Student("Joan", "Segoiva", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","DAM1"));
        students.add(new Student("Carles", "Avila", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","DAW1"));
        students.add(new Student("Pol", "Verdejo", LocalDate.of(2002, Month.DECEMBER, 19), "12345678G","DAW2"));





        for(int i =0; i< students.size();i++){
            students.get(i).setEmail();
        }

        return students;
    }


    //MOSTRA TOTS ELS MODULS, LES UFS I ELS ALUMNES QUE ESTAN A CADA MODUL
    @GetMapping(path = "/MODULS")
    public ArrayList<modul> getmoduls() {
        ArrayList<modul> moduls = new ArrayList<>();
        ArrayList<Student> students = (ArrayList<Student>) getStudents();

        modul M1 = new modul("M1", 60, getUfs_M1());
        modul M2 = new modul("M2", 60, getUfs_M2());

        moduls.add(M1);
        moduls.add(M2);
        return moduls;
    }

    //Mostrar un modul
    @GetMapping(path = "/MODULS/{modul}")
    public ArrayList<modul> getmodul1(@PathVariable String modul) {
        ArrayList<modul> moduls = getmoduls();
        ArrayList<modul> moduls_tornada = new ArrayList<>();

        for (int i = 0; i<moduls.size();i++){
            if (moduls.get(i).getNom().equals(modul)){
                moduls_tornada.add(moduls.get(i));
            }
        }

        return moduls_tornada;

    }

    //Mostrar una UF
    @GetMapping(path = "/UFS/{UF}")
    public UF getuf1(@PathVariable String UF) {
        ArrayList<UF> ufs = getUfs();
        ArrayList<UF> ufs_t = new ArrayList<>();

        for (int i=0; i< ufs.size();i++){
            if (ufs.get(i).getNom().equals(UF)){
                ufs_t.add(ufs.get(i));
            }
        }



        return ufs_t.get(0);

    }

    //Mostrar un alumne passant el seu ID
    @GetMapping(path = "/IDS/{ID}")
    public ArrayList<Student_Array_ufs> get_student_by_id(@PathVariable String ID) {
        ArrayList<Student> students = getStudents();
        ArrayList<UF_no_student_array> ufs_post = new ArrayList<>();
        int hores_t;
        String perc;

        ArrayList<Student_Array_ufs> persona = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID().equals(ID)) {
                persona.add(new Student_Array_ufs(
                        students.get(i).getNom(),
                        students.get(i).getCognoms(),
                        students.get(i).getData_neixement(),
                        students.get(i).getID(),
                        students.get(i).getEmail()

                ));
            }
        }

            for (int p = 0; p < getmoduls().size(); p++) {
                for (int l = 0; l < getmoduls().get(p).getUfs().size(); l++) {
                    for (int t = 0; t < getmoduls().get(p).getUfs().get(l).getStudents().size(); t++) {

                        if (getmoduls().get(p).getUfs().get(l).getStudents().get(t).getID().equals("12345678F")) {
                           // ufs_pre.add(getmoduls().get(p).getUfs().get(l));
                            UF uf = (getmoduls().get(p).getUfs().get(l));

                            hores_t=getmoduls().get(p).getUfs().get(l).getStudents().get(t).getHores_assistides();
                            perc=getmoduls().get(p).getUfs().get(l).getStudents().get(t).getPercentatge();
                            ufs_post.add(new UF_no_student_array(
                                    uf.getHores_totals(),
                                    uf.getNom(),
                                    hores_t,
                                    perc

                            ));




                        }
                    }
                }
            }




        persona.get(0).setUfs(ufs_post);
        return persona;

        }

    @GetMapping(path = "/GRUPS")
    public ArrayList<group_w_Students> getgrups(){
        ArrayList<group_w_Students> grups = new ArrayList<>();
        ArrayList<Student> students= getStudents();

        group_w_Students DAM1= new group_w_Students("DAM1");
        group_w_Students DAM2= new group_w_Students("DAM2");
        group_w_Students DAW1= new group_w_Students("DAW1");
        group_w_Students DAW2= new group_w_Students("DAW2");
        group_w_Students ASIX1= new group_w_Students("ASIX1");
        group_w_Students ASIX2= new group_w_Students("ASIX2");
        group_w_Students SMIX1= new group_w_Students("SMIX1");
        group_w_Students SMIX2= new group_w_Students("SMIX2");

        grups.add(DAM1);
        grups.add(DAM2);
        grups.add(DAW1);
        grups.add(DAW2);
        grups.add(ASIX1);
        grups.add(ASIX2);
        grups.add(SMIX1);
        grups.add(SMIX2);

        for (int i=0;i< grups.size();i++){
                grups.get(i).putStudents(students);
        }


        return grups;
    }

    @GetMapping(path = "/GRUPS/{GRUP}")
    public ArrayList<group_w_Students> get1grup(@PathVariable String GRUP){
        ArrayList<group_w_Students> grups=getgrups();
        ArrayList<group_w_Students> grups_r=new ArrayList<>();

        for (int i=0; i< grups.size();i++){
            if (grups.get(i).getName().equals(GRUP)){
                grups_r.add(grups.get(i));
            }
        }

    return grups_r;

    }


    //MUESTRA TODOS LOS CICLOS CON SUS GRUPOS Y AULAS
    @GetMapping(path = "/cicles")
    public ArrayList<Ciclo> getCiclos(){
        ArrayList<Ciclo> ciclos=new ArrayList<>();

        //arrayList con los grupos(DAM,DAW,ASIX,SMIX)
        ArrayList<Grupo> Dam=new ArrayList<>();
        Dam.add(new Grupo("DAM1","33"));
        Dam.add(new Grupo("DAM2","DIBUIX"));

        ArrayList<Grupo> Daw=new ArrayList<>();
        Daw.add(new Grupo("DAW1","34"));
        Daw.add(new Grupo("DAW2","35"));

        ArrayList<Grupo> ASIX=new ArrayList<>();
        ASIX.add(new Grupo("ASIX1","25"));
        ASIX.add(new Grupo("ASIX2","26"));

        ArrayList<Grupo> SMIX=new ArrayList<>();
        SMIX.add(new Grupo("SMIX1","18"));
        SMIX.add(new Grupo("SMIX2","19"));

        ciclos.add(new Ciclo("DAM",Dam));
        ciclos.add(new Ciclo("DAW",Daw));
        ciclos.add(new Ciclo("ASIX",ASIX));
        ciclos.add(new Ciclo("SMIx",SMIX));


        return ciclos;
    }


    }

