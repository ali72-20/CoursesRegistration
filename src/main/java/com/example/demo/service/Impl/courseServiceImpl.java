package com.example.demo.service.Impl;

import com.example.demo.Entities.Course;

import com.example.demo.repository.CourseRepo;
import com.example.demo.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseServiceImpl implements courseService {

    @Autowired
    CourseRepo courseRepo ;
    @Override
    public Course create(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}
