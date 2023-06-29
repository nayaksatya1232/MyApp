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
	
	@GetMapping("/")
	public String home() {
		return "Application Working..";
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return this.stdRepo.findAll(); 
	}
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student std) {
		return this.stdRepo.save(std);
	}
}
