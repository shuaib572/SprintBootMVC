package com.coding.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.model.Student;
import com.coding.repo.StudentRepository;

@Service
public class StudentImpl implements IStudentServices {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveData(Student s) {
		
		return repo.save(s).getSid();
	}

	@Override
	public void updateStudent(Student s) {
		repo.save(s);

	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Optional<Student> getOneStudent(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public boolean isStudentExist(Integer id) {
		
		return repo.existsById(id);
	}

}
