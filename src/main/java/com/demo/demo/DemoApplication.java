package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private StudentRepo studentRepo;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}

	@GetMapping("/getData")
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}