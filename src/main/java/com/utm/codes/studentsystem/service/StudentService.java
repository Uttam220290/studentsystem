package com.utm.codes.studentsystem.service;

import com.utm.codes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student getStudent(Long id);
    public List<Student> getAllStudent();
}
