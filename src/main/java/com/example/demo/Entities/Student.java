package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;

    private String mail;

    private int course_id;

   public Student(){}
    public Student(int id, String name, String mail){
       this.id = id;
       this.name = name;
       this.mail = mail;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}
