package com.anderson.firstspringdata.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.firstspringdata.entity.Student;
import com.anderson.firstspringdata.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> listStudent(){
		return this.studentRepository.findAll();
	}
}
