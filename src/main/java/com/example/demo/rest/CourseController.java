package com.example.demo.rest;


import com.example.demo.Entities.Course;
import com.example.demo.Entities.Student;
import com.example.demo.service.Impl.courseServiceImpl;
import com.example.demo.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    courseService courseService;


    @Autowired
    courseServiceImpl courseServicei;
    @PostMapping("/store")
    public Course saveCourse(@RequestBody Course course){
        return  courseService.create(course);
    }



    @GetMapping("/list")
    public List<Course> getAllCourses() {
        return courseServicei.getAllCourses();
    }

}
