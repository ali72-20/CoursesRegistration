package com.example.demo.repository;

import com.example.demo.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {

}
