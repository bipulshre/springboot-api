package com.example.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//responsible for data access
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
