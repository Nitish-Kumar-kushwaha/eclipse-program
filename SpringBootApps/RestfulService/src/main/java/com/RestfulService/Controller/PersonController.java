package com.RestfulService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestfulService.model.Person;

@RestController
@RequestMapping("/v1/api")
public class PersonController {
	
	@GetMapping("/test")
	public String getValue() {
		return "This is restAPI Service Application";
	}
	
	@PostMapping("/test")
	public String PrintPersonValues(@RequestBody Person person) {
		System.err.println("person id: "+ person.getPid());
		System.out.println("person name : " + person.getPname());
		System.out.println("Person phone number: "+ person.getPhone());
		System.out.println("person Email: "+ person.getEmail());
		
		return "Done!!";
	}
	
	@GetMapping("/test/{id}")
	public String getValue(@PathVariable Integer id) {
		return "This is get mapping with  value" + id;
	}

}
