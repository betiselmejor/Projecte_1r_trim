package com.example.spring_jpa.controller;


import com.example.spring_jpa.entitats.Client;


import com.example.spring_jpa.repositoris.ClientsRepositori;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class clientscontroller {

    @Autowired
    ClientsRepositori clientRep;//No cal fer new


    @GetMapping("clients/{id}")
    public Client getClient(@PathVariable long id){
       Client Client1 = clientRep.findById(id).get();
       return Client1;

    }

  //  @DeleteMapping(clients/borrar/{id})

  //  @PutMapping()

    @GetMapping("clients")
    public List<Client> getclients(){

       return (List<Client>) clientRep.findAll();

    }

    @GetMapping("clients2")
    public Iterable<Client> getclients2(){

        return clientRep.findAll();

    }

}
