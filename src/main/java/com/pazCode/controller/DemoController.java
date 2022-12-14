package com.pazCode.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pazCode.model.Person;
import com.pazCode.repo.IPersonRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonRepo repo;
	
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		if(name==null || name.isEmpty())
//			name="GabrielCode";
		if(name.endsWith("World")) {
			repo.delete(new Person (3, "Nerea"));
			name="GabrielCode";
		}
		
		
		Person per = new Person(0, name);
		repo.save(per);
		
		model.addAttribute("name", name);
		
		return "greeting";
	}
}







