package com.nbsc.nbsc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nbsc.nbsc.models.Student;

@Service
public interface StService {

    List<Student> getAllStudent();  

    Student saveStudent(Student student);
	
	Student getStudentById(Integer id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Integer id);
}
