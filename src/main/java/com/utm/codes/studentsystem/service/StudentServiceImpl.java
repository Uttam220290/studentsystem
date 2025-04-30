package com.utm.codes.studentsystem.service;

import com.utm.codes.studentsystem.exception.ResourceNotFoundException;
import com.utm.codes.studentsystem.model.Student;
import com.utm.codes.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        System.out.println("Student=== "+student.getId());
        if(!Objects.isNull(studentRepository.existsByName(student.getName()))){
            throw  new ResourceNotFoundException("Id is already exist with given id.");
        }
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {

        return studentRepository.findAll();
    }

}
