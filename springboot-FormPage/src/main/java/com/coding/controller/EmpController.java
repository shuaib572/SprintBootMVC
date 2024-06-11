package com.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding.model.Employee;

@Controller
public class EmpController {
	
	@RequestMapping({"/","Reg"})
	public String regFrom()
	{
		System.out.println("Controller ");
		return "empReg";
	}
	
	//@RequestMapping(value = "/save",method=RequestMethod.POST)
	@PostMapping("/save")
	public String showData(@ModelAttribute Employee emp,Model model)
	{
		System.out.println("Empdata");
		model.addAttribute("data",emp);
		
		return "EmpData";
	}
}
