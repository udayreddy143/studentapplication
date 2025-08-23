package com.jswin.StudentApplication.repo;

import com.jswin.StudentApplication.service.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jswin.StudentApplication.entity.StudentEntity;
@Component
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {

}
