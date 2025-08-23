package com.jswin.StudentApplication.repo;

import com.jswin.StudentApplication.service.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jswin.StudentApplication.entity.Student;
@Component
public interface StudentRepo extends JpaRepository<Student,Long> {

}
