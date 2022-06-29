package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//这里对应的是 localhost:8080/api/student
@RequestMapping("api/student")
public class studentController {
    @GetMapping
    public String getController(){
        return "HelloWorld";
    }


    @GetMapping
    @RequestMapping("/h1")
    //这里对应的是 localhost:8080/api/student/h1
    public String getController1() { return "Helloworld1";}

    @GetMapping
    @RequestMapping("/h2")
    //这里对应的是 localhost:8080/api/student/h2
    public String getController2() { return "Helloworld2";}


}

