package com.example.practice1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student1 {

    @Id
    private int rollno;
    private String name;
    private String  dept;

    public student1(int rollno, String name, String dept) {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public student1() {
    }


}
