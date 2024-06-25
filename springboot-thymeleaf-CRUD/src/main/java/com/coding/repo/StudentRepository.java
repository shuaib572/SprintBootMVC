package com.coding.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
