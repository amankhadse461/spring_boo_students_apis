package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface HomeService {

	List<Student> getalldata();

	Student savedata(Student student);

	void deletedata(int rollno);

	Student editdata(Student s, int rollno);

	Student getbyid(int rollno);

}
