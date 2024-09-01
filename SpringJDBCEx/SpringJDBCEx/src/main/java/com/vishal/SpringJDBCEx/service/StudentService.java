package com.vishal.SpringJDBCEx.service;

import com.vishal.SpringJDBCEx.model.Student;
import com.vishal.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student s) {
       studentRepo.save(s);
    }
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
