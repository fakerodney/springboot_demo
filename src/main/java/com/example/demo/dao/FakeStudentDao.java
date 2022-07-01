package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao{


    private static List<Student> Database = new ArrayList<>();

    @Override
    public List<Student> selectAllStudents() {
        return Database;
    }

    @Override
    public int insertStudent(Student student) {
       UUID id = UUID.randomUUID();
       Database.add(new Student(id,student.getName()));
       return 0;
    }
}
