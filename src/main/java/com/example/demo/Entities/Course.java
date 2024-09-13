package com.example.demo.Entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {

    @Id
    private int course_id;

    private String course_name;

    public Course(){}

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

}
