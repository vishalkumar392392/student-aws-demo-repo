package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello world....";
	}
	
	@GetMapping(path = "/students")
	public List<Student> getStudents() {
		return service.getStudents();
	}
	
	@PostMapping(path = "/students")
	public Student create(@RequestBody Student student) {
		
		return service.create(student);
		
	}
	
	

}
