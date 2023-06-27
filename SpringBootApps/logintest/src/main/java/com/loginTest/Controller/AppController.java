package com.loginTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.loginTest.Model.Register;
import com.loginTest.Service.RegisterServiceImpl;

@Controller
public class AppController {

	@Autowired
	RegisterServiceImpl regService;

	@GetMapping(value = "/reg")
	public String home() {

		return "Register";
	}

	@PostMapping(value = "/insertreg")
	public String home(@ModelAttribute Register reg) {

		System.out.println(reg);
		String res = regService.AddRegister(reg);

		if (res == "Success") {
			return "Login";
		}

		return "Register";
	}

	@GetMapping(value = "/login")
	public String login() {
		System.out.println("login called");

		return "Login";
	}

	@PostMapping(value = "/insertlogin")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
		Register reg = regService.showUser(email);
		if (reg.getPassword().equals(password)) {
			return "Dashboard";
		}

		System.out.println(reg);
		return "error";
	}

}
