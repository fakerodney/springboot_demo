package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//这里对应的是 localhost:8080/api/student
@RequestMapping("api/student")
public class studentController {

    private StudentService studentService;

    @Autowired
    public studentController(StudentService studentService) {
        this.studentService = studentService;
    }

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
    public List<Student> getController2() {
        return studentService.getAllStudents();
    }

    @PostMapping
    @RequestMapping("/h3")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping
    @RequestMapping("/h4")

    public String changeStudent(@RequestBody Student student){
        return studentService.changeStudent(student);
    }

}

