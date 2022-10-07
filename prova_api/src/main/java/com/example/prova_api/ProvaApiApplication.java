package com.example.prova_api;

import ch.qos.logback.core.net.server.Client;
import com.example.prova_api.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
//hola hola hola
@SpringBootApplication

public class ProvaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvaApiApplication.class, args);
    }



}

