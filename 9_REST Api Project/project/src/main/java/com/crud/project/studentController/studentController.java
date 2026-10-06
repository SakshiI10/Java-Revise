package com.crud.project.studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.project.model.student;
import com.crud.project.studentRepo.studentRepo;

@RestController
public class studentController {
	@Autowired
    studentRepo repo;

    @GetMapping("/student")
    public List<student> getAllStudents() {

        List<student> list = repo.findAll();

        return list;
    }
    
    @GetMapping("/student/{id}")
    public student getStudentById(@PathVariable int id) {
    	student student=repo.findById(id).get();
    	return student;
    }
    
//    Use postman
    @PostMapping("/create")
    public student createStudent(@RequestBody student student) {

        return repo.save(student);
    }
    
//    Use postman
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
    	student student=repo.findById(id).get();
        repo.deleteById(id);

        return "Student deleted successfully";
    }
}
