package com.satya.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.entity.Student;
import com.satya.repo.StudentRepo;

@RestController
public class MainController {
	@Autowired
	private StudentRepo stdRepo;
	
	
	
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		List<Student> list =  Arrays.asList(new Student(10,"Satya",25));
		return list; 
	}
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student std) {
		return this.stdRepo.save(std);
	}
}
