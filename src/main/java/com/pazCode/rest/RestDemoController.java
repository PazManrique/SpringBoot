package com.pazCode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pazCode.model.Person;
import com.pazCode.repo.IPersonRepo;

@RestController
@RequestMapping("/persons")
public class RestDemoController {
	
	@Autowired
	private IPersonRepo repo;
	
	@GetMapping
	public List<Person> list(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody Person per) {
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{code}")
	public void delete(@PathVariable("code") Integer code) {
		repo.deleteById(code);
	}

}
