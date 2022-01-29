package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entity.Student;

@Service
public interface StudentService {

	List<Student> getStudents();

	Student create(Student student);

}
