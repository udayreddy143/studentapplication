package com.jswin.StudentApplication.service;

import com.jswin.StudentApplication.dto.Student;
import com.jswin.StudentApplication.entity.StudentEntity;
import com.jswin.StudentApplication.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    private StudentRepo studentrepo;


  void saveStudentDetails(Student student){
      StudentEntity entity= new StudentEntity();

      entity.setAddress(student.getAddress());
      entity.setName(student.getName());
      studentrepo.save(entity);

  }
}
