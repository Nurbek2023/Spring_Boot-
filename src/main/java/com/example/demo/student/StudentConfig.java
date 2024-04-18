package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean

    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student nurbek = new Student(
//                    1L,
                    "Nurbek",
                    "nurbek.mamasaliev2023@gmail.com",
                    LocalDate.of(2004, Month.MAY,29)
            );

            Student alex = new Student(
//                    1L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.MAY,29)
            );

            repository.saveAll(
                    List.of(nurbek, alex)
            );



        };
    }
}
