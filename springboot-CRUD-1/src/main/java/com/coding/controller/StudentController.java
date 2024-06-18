package com.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.model.Student;
import com.coding.services.IStudentServices;
import com.coding.studentValidator.StdValidator;

@Controller
public class StudentController {
	 
	@Autowired
	private StdValidator validator;
	@Autowired
	private IStudentServices services;
	
	//Show Reg page
	@GetMapping("/register")
	public String showPage(Model model)
	{
		System.out.println("register");
		model.addAttribute("student", new Student());
		return "StudentRegister";
	}
	
	
	//save Student
	@PostMapping("/save")
	public String save(@ModelAttribute Student student,
			Errors error,
			Model model)
	{
		System.out.println("Save URL");
		 validator.validate(student, error); 
		 if(!error.hasErrors()) { // No Error
				services.saveStudent(student);
//				model.addAttribute("msg","Student'"+id+"'saved!");
				
				// from Backing Object
				model.addAttribute("student", new Student());
		 }
		 else { // error
			 model.addAttribute("msg","Please Check All Errors!");
		 }
		 

		return "StudentRegister"; 
	}
	// Fetch Data From UI
	
	@GetMapping("/show")
	public String fetchData(Model model)
	{
		System.out.println("Show");
		List<Student> list = services.getAllStudent();
		
		return "student";
	}


}
