package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private StudentDao studentDao;


    @Autowired
    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }


    public List<Student> getAllStudents(){
        return studentDao.selectAllStudents();
    }

    public String addStudent(Student student){
        return studentDao.insertStudent(student);
    }

    public String changeStudent(Student student){
        return studentDao.changeStudent(student);
    }
}
