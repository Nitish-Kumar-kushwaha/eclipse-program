package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	
	
	@RequestMapping(value="/page1", method=RequestMethod.GET)
	public String viewpage1(Model m){
		m.addAttribute("msg", "This is MVC Info sending from controller to view");
		
		return "Page1";
	}
	
	@RequestMapping(value="/page2", method = RequestMethod.GET)
	public String viewpage2(Model m) {
		int x = 1000;
		String res = "the value is "+x;
		m.addAttribute("xval" , res);
		return "Page2";
	}

}
