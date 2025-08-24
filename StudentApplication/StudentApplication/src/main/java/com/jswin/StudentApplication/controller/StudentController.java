package com.jswin.StudentApplication.controller;


import com.jswin.StudentApplication.dto.Student;
import com.jswin.StudentApplication.entity.StudentEntity;
import com.jswin.StudentApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student)
    {
        studentService.saveStudentDetails(student);
    }

    @GetMapping
     public List<StudentEntity> getDetails(){

       return studentService.getDetails();
     }
}
