package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Student {

    private UUID id;

    private String name;

    public Student(UUID id, String name){
        this.id = id;
        this.name = name;
    }

    //使用json ignore，则不会被序列化，但是可以被其他的方法使用
    //@JsonIgnore
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
