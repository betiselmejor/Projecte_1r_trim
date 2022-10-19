package com.example.spring_jpa.repositoris;

import com.example.spring_jpa.entitats.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientsRepositori extends CrudRepository<Client,Long> {




}
