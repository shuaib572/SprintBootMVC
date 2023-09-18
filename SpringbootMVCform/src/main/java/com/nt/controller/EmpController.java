package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;

@Controller
public class EmpController {
	
	@RequestMapping("/data")
	public String EmpData()
	{
		return "empReg";
	}
	
	
	@PostMapping("/save")
	public String redData(
			@ModelAttribute Employee emp
			//@ModelAttribute("employee")Employee emp
			,Model model)	{
		
		model.addAttribute("data",emp );
		
		return "success";
	}
}
