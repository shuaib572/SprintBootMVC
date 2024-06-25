package com.coding.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding.model.Student;

@Service
public interface IStudentServices {
	
	public Integer saveData(Student s);
	public void updateStudent(Student s);
	public void deleteStudent(Integer id);
	public Optional<Student> getOneStudent(Integer id);
	public List<Student> getAllStudent();
	public boolean isStudentExist(Integer id);
}
