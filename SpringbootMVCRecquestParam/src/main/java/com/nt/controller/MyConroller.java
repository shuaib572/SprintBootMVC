package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyConroller {
	// Case 1 By default every @RequestParam property is Required. It means key must present
	//   with value in Request URL.  
	   
	@RequestMapping("/show")
	public String show(@RequestParam Integer eid,
						@RequestParam("ename")String name,
						@RequestParam("esal")Double sal,
						Model model)
	{
		model.addAttribute("id",eid);
		model.addAttribute("name", name);
		model.addAttribute("sal", sal);
		return"emp";
	}
	// case 2 We can make Parameter as Optional by adding attribute
	@RequestMapping("/show1")
	public String show1(@RequestParam(value = "ename",required = false) String name,Model model)
	{
		model.addAttribute("id",name);
		
		return"emp";
	}
	// case 3 Set default value
	@RequestMapping("/show2")
	public String show2(@RequestParam(value="eid",required = false,defaultValue ="000")Integer id,Model model)
	{
		model.addAttribute("id", id);
		return"emp";
	}
}
