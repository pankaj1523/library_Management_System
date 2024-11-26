package org.jpa.librarymanagementsystem.Service.Impl;

import org.jpa.librarymanagementsystem.Entity.Student;
import org.jpa.librarymanagementsystem.Repository.StudentRepository;
import org.jpa.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added Successfully";
    }
}
