package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao{


    private static List<Student> Database = new ArrayList<>();

    @Override
    public List<Student> selectAllStudents() {
        return Database;
    }

    @Override
    public String insertStudent(Student student) {
       UUID id = UUID.randomUUID();
       Database.add(new Student(id,student.getName()));
       return "Successfully add student";
    }

    @Override
    public String changeStudent(Student student) {

        UUID tofind = student.getId();
        int index = -1;
        for (int i = 0; i < Database.size();i++){
            if (Database.get(i).getId().equals(tofind)){
                index = i;
                break;
            }
        }
        Database.set(index,student);
        return "Successfully update student";
    }

    public Optional<Student> selectStudent(UUID id){
        for (Student s : Database){
            if (s.getId().equals(id)){
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    @Override
    public int deleteStudent(UUID id) {
        Optional<Student> optionalStudent = selectStudent(id);
        if (!optionalStudent.isPresent()){
            return -1;
        }
        Database.remove(optionalStudent.get());
        return 1;
    }
}
