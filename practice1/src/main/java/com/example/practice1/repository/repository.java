package com.example.practice1.repository;

import com.example.practice1.model.student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<student1,Integer>{
}
