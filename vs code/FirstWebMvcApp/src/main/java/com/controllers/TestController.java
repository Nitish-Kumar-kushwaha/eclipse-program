package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	
	@RequestMapping(value="/page1", method=RequestMethod.GET)
	public String ViewPage1(Model m) {
		m.addAttribute("msg", "This is MVC Info sending from controller to view");
		return "Page1";
	}
	
	@RequestMapping(value="/page2", method=RequestMethod.GET)
	public String ViewPage2(Model m) {
		
		return "Page2";
	}
	
}
