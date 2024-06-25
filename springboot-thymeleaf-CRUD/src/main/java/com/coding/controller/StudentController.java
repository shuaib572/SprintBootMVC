package com.coding.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.model.Student;
import com.coding.services.IStudentServices;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentServices service;
	
	//1. Show Register Page With from backing Object 
	@GetMapping("/register")
	public String Show(Model model)
	{
		model.addAttribute("student",new Student());
	 	return "studentRegister";
	}
	//2. read  fromdata and save op
	
	@PostMapping("/save")
	public String save(@ModelAttribute Student std,Model model )
	{
		Integer sID= service.saveData(std);
		System.out.println(sID);
		System.out.println(std.getSid()+" "+std.getSname());
		model.addAttribute("message","Studente '"+sID+"'saved!");
		model.addAttribute("student",new Student());
		return "studentRegister";
	}
	// 3. Fetch all record
	
	@GetMapping("/all")
	public String showData(Model model)
	{
		List<Student> list = service.getAllStudent();
		model.addAttribute("list",list);
		return "studentData";
	}
	// 4. Delete student id
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id,Model model)
	{
		service.deleteStudent(id);
		List<Student> list = service.getAllStudent();
		model.addAttribute("list", list);
		model.addAttribute("msg", "Record '"+id+"' Deleted!");
		return "studentData";
		//return "redirect:all";
	}
	 //5. Update
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id, Model model)
	{
		System.out.println("ShowEdit");
		Optional<Student>   opt= service.getOneStudent(id);
		System.out.println(id);
		model.addAttribute("student", opt.get());
		System.out.println(opt.get().toString());
		
		return "studentEdit";
	}
	//6. update operation
	
	@PostMapping("/update")
	public String updateData(@ModelAttribute Student std, Model model)
	{
		service.updateStudent(std);
		List<Student> list = service.getAllStudent();
		model.addAttribute("list", list);
		model.addAttribute("msg", "Student Update");
		return "studentData";
	}

}
