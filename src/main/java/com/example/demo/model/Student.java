package com.example.demo.model;

import java.util.UUID;

public class Student {

    public UUID id;

    public String name;

    public Student(UUID id, String name){
        this.id = id;
        this.name = name;
    }
}
