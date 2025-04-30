package com.utm.codes.studentsystem.controller;

import com.utm.codes.studentsystem.exception.ResourceNotFoundException;
import com.utm.codes.studentsystem.model.Student;
import com.utm.codes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){

        System.out.println("Name= "+student.getName());

        studentService.saveStudent(student);
        return "New student is registered added";

    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }

}
