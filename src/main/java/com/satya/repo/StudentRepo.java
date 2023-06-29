package com.satya.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	public List<Student> findAll();
}
