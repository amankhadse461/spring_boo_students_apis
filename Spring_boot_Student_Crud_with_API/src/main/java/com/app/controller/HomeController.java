package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.HomeService;

@RestController
@RequestMapping("/api/students")
public class HomeController {
	@Autowired
	HomeService hs;

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return hs.getalldata();
	}

	@PostMapping("/registerStudent")
	public Student createStudent(@RequestBody Student student) {
		return hs.savedata(student);
	}

	@DeleteMapping("/deleteStudent/{rollno}")
	public void deletestudent(@PathVariable int rollno) {
		hs.deletedata(rollno);
	}

	@PutMapping("/updateStudent/{rollno}")
	public Student editdata(@PathVariable int rollno, @RequestBody Student s) {
		return hs.editdata(s, rollno);
	}

	@GetMapping("/getStudentById/{rollno}")
	public Student getbyId(@PathVariable int rollno) {
		return hs.getbyid(rollno);
	}

}
