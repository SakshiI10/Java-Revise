package com.crud.project.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.project.model.student;

public interface studentRepo extends JpaRepository<student,Integer>{

}
