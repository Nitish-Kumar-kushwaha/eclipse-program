package com.SpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

//	@RequestMapping(value = "/p1", method = RequestMethod.GET)
	@GetMapping(value = "/p1")
	public String FirstPage(Model m) {
		
		m.addAttribute("msg", "hello this is from page 1");
		
		
		return"Page1";
	}
	
//	@RequestMapping(value = "/p2", method = RequestMethod.GET)
	@GetMapping(value = "/p2")
	public String SecondPage() {
		
		
		return"Page2";
	}
	
//	@RequestMapping(value = "/pagee2", method = RequestMethod.POST)
	@PostMapping(value = "/p2")
	public String SecondPage( @RequestParam("txtPname") String pname,  Model m) {
		
		m.addAttribute("msg", "button clicked , given value is " + pname);
		
		return"Page2";
	}
	
	@GetMapping(value = "/login")
	public String LoginPage(Model m) {
		

		return "Login";
	}
	
	@PostMapping(value = "loginProcess")
	public String LoginPage( @RequestParam("txtUname") String uname, 
			@RequestParam("txtPwd") String pwd,Model m) {
		
		if(uname.equalsIgnoreCase("nitish") && pwd.equals("12345")) {
			return "Welcome";
		}
		else {
			m.addAttribute("msg", "Please check Username/Password");
		}
		return "Login";
	}
	
	@GetMapping(value = "/welcome")
	public String WelcomePage() {
		return "welcome";
	}
	
}
