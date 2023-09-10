package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	
		@RequestMapping("/data")
		public String EmpView(Model model)
		{
			
			model.addAttribute("ename","welcome to java");
			model.addAttribute("eid", 101);
			model.addAttribute("ecity", "dli");
			//List Data
			List<String> list=List.of("Name1","Name2","Name3");
			model.addAttribute("list", list);
//			Map data
			Map map=Map.of("k1","v1","k2","v2");
			model.addAttribute("map",map);
			
			return "Emp";
		}
}
