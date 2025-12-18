package com.example.demo.controller;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentService.postStudent(student);
    }
    @GetMapping("/getall")
    public List<Student>get(){
        return studentService.getAllStudent();
    }
    @GetMapping("/getbyId/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.getById(id);
    }
    @PutMapping("/update/{id}")
    public String updateData(@PathVariable Long id ,@RequestBody Student st){
        return studentService.updateData(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable Long id){
        return studentService.deleteData(id);
    }

}
