package com.example.demo.service.impl;

import org.springframework.sterotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
@service

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student postStudent(Student st){
        return stdrepo.save(st);
    }
}
