package com.example.practice1.controller;

import com.example.practice1.model.student1;
import com.example.practice1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {


    @Autowired
   StudentService studentService;

    @GetMapping("students")
    public List<student1> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("addstudents")
    public String addStudents(@RequestParam("rollno")Integer rollno,
                              @RequestParam("name")String name,
                              @RequestParam("dept")String dept){
        try {
            studentService.addStudents(rollno, name, dept);
            return "Successfully added";
        }catch (IllegalArgumentException e) {
        return e.getMessage();
        }
    }


    @DeleteMapping("delete student/{rollno}")
        public ResponseEntity<String> deletestudentbyid(@PathVariable int rollno){
        boolean isdeleted=studentService.deletestudentbyid(rollno);
        if(isdeleted){
            return ResponseEntity.ok("Deleted Sucessfully");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("roll no not found");
        }

    }

    @PostMapping("updatestudents")
    public String updatetudent(@RequestParam int rollno, @RequestParam String name, @RequestParam String dept){
        student1 student=new student1(rollno,name,dept);
        return studentService.updatestudent(student);

    }

}
