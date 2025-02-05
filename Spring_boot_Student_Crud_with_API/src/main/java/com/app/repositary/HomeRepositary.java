package com.app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface HomeRepositary extends JpaRepository<Student, Integer> {
	
	Student findByRollno(int rollno);
	

}
