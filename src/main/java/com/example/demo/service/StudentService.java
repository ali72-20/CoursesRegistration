package com.example.demo.service;

import com.example.demo.Entities.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public Student create(Student student);
}
