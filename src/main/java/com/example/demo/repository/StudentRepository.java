package com.example.demo.repository;

import org.springframework..repository.JpaRepository;
import com.example.demo.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository <Student,Long> {
}
