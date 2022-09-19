package com.example.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    //comment added
    public List<Student> getStudents(){

        return List.of(
                new Student(
                        1L,
                        "ram",
                        "ram@gmail.com",
                        LocalDate.of(2000, Month.DECEMBER,22),
                        22
                )

        );
    }
}
