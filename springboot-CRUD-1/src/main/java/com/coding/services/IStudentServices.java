package com.coding.services;

import java.util.List;
import java.util.Optional;

import com.coding.model.Student;

public interface IStudentServices {
	
	public void saveStudent(Student s);
	
	public void updateStudent(Student s);
	
	public void deleteStudent(Integer id);
	
	public Optional<Student> getOneStudent(Integer id);
	
	public List<Student> getAllStudent();
	
	public boolean isStdPresent(Integer id);
	
	}
