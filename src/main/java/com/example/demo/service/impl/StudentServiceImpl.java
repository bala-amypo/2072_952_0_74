package com.example.demo.service.impl;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stdrepo;

    @Override
    public Student postStudent(Student st) {
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllStudent(){
         return stdrepo.findAll();
    }
    @Override
    public Optional<Student> getById(Long id){
        return stdrepo.findById(id);
    }
    @Override
    public String updateData(Long id,Student st){
        boolean Status=stdrepo.existsById(id);
        if(Status){
           st.setId(id);
           stdrepo.save(st);
           return "Successfully updates";
        }else{
            return "Student with "+id+" not found ";
        }
    
    }

}
