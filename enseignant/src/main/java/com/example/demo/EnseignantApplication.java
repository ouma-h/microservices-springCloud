package com.example.demo;

import com.example.demo.dao.enseignantRepository;
import com.example.demo.entity.enseignant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication


public class EnseignantApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnseignantApplication.class, args);
    }
}

