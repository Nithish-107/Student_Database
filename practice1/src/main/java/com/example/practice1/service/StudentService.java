package com.example.practice1.service;

import com.example.practice1.model.student1;
import com.example.practice1.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    repository studentRepo1;
    public List<student1> getStudents() {
        return studentRepo1.findAll();
    }

    public void addStudents(int rollno, String name, String dept) {
        if(studentRepo1.existsById(rollno)){
            throw new IllegalArgumentException("Student with rollno already exist!!");
        }
        student1 Student1=new student1(rollno,name,dept);
        studentRepo1.save(Student1);
    }

    public boolean deletestudentbyid(int rollno) {
        if(studentRepo1.existsById(rollno)){
            studentRepo1.deleteById(rollno);
            return  true;
        }
        return false;
    }

    public String updatestudent(student1 student) {
        if(studentRepo1.existsById(student.getRollno())){
            studentRepo1.save(student);
            return "sucessfully updated";
        }
        else{
            return "Error: student with Rollno"+student.getRollno()+"not exist";
        }
    }
}
