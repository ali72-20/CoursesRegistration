package com.example.demo.rest;

import com.example.demo.Entities.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/store")
    public Student saveStudent(@RequestBody Student student){
        return  studentService.create(student);
    }
}
