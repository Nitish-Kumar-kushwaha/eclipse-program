package firstSpringApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import firstSpringApp.model.User;
import firstSpringApp.service.UserService;


@Controller
public class ContactController {
	
	@GetMapping(value = "/contact")
	public String showForm() {
		return "contact";
		
	}
	
	@PostMapping(value = "processForm")
	public String handleForm(@ModelAttribute User user, Model m) {
		
		System.out.println(user);
		UserService service = new UserService();
		service.createUser(user);
		System.out.println(user);
		return "contact";
	}
	
	/*
	@PostMapping(value = "/processForm")
	public String handleForm(@RequestParam("email") String email , 
			@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		
		

		System.err.println(email);
		System.out.println(userName);
		System.out.println(password);
		return"contact";
	}
	*/

}




