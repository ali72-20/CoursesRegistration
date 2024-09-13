package com.example.demo.service;

import com.example.demo.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface courseService {

    public Course create(Course course);

    public List<Course> getAllCourses();

}
