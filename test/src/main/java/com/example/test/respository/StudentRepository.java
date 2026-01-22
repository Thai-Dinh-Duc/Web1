package com.example.test.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.models.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameContainingIgnoreCase(String name);
}