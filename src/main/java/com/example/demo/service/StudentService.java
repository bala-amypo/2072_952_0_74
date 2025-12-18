package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {
    Student postStudent(Student st);
     List<Student>getAllStudent();
     Optional<Student> getById(Long id);
     String updateData(Long id,Student st);

}