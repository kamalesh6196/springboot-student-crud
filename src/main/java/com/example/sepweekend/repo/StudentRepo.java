package com.example.sepweekend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sepweekend.model.student;
@Repository                                                           
public interface StudentRepo extends JpaRepository<student, Integer> {
                 
}
