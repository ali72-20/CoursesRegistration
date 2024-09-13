package com.example.demo.service.Impl;

import com.example.demo.Entities.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student create(Student student) {
        return studentRepo.save(student);
    }
}
