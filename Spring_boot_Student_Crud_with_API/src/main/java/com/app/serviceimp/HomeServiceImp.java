package com.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repositary.HomeRepositary;
import com.app.service.HomeService;

@Service
public class HomeServiceImp implements HomeService {

	@Autowired
	HomeRepositary hr;
	@Override
	public List<Student> getalldata() {
		
		return hr.findAll();
	}
	@Override
	public Student savedata(Student student) {
		
		return hr.save(student);
	}
	@Override
	public void deletedata(int rollno) {
		
		 hr.deleteById(rollno);;
	}
	@Override
	public Student editdata(Student s, int rollno) {
		Student student= hr.findByRollno(rollno);
		student.setName(s.getName());
		student.setUsername(s.getUsername());
		student.setPassword(s.getPassword());
		student.setEmail(s.getEmail());
		return hr.save(student);
	}
	@Override
	public Student getbyid(int rollno) {
		
		return hr.findByRollno(rollno);
	}

}
