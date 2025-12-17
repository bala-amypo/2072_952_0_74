package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StudentController {

    @Autowired
    StudentService stdser;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st) {
        return stdser.postStudent(st);
    }
}
