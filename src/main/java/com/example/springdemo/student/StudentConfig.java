package com.example.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student ram= new Student(

                    "ram",
                    "ram@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,22),
                    22
            );
            Student shyam= new Student(

                    "shyam",
                    "shyam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,22),
                    22
            );

            repository.saveAll(
                    List.of(ram,shyam)
            );
        };



    }
}
