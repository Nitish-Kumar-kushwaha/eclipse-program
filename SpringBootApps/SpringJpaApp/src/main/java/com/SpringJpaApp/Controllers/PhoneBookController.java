package com.SpringJpaApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringJpaApp.model.PhoneBook;
import com.SpringJpaApp.service.PhoneBookService;

@Controller
public class PhoneBookController {
	
	@Autowired
	PhoneBookService pbs;

	@GetMapping("/newcustomer")
	public String AddNewCustomer(Model m) {
		
		return"AddNewCustomer";
	}
	
	@PostMapping("/addnewcustomer")
	public String AddNewCustomer( @RequestParam("txtPname") String Pname, 
			@RequestParam("txtPhone") String phone, 
			@RequestParam("txtEmail") String email,
			Model m) {
		
		System.out.println(Pname + " "+ phone+" "+ email);
		
		PhoneBook pb = new PhoneBook();
		pb.setPname(Pname);
		pb.setPhone(phone);
		pb.setEmail(email);
		
		String res = pbs.AddPhoneBook(pb);
		
		if(res.equals("Sucess"))
			m.addAttribute("msg", "Added new person details");
		else
			m.addAttribute("msg", "Error");
		
		return "AddNewCustomer";
		
	}
	
	@GetMapping("/showall")
	public String ShowAllCustomers(Model m) {
		
		List<PhoneBook> allcustomers = pbs.ShowAll();
		
		m.addAttribute("vall",allcustomers);
		
		
		return"ShowAllCustomers";
	}
	
	@GetMapping("/search")
	public String SearchCustomer(Model m) {
		
		return "SearchCustomer";
		
	}
	
	@PostMapping("/fetchinfo")
	public String SearchCustomer(@RequestParam("txtSearch") Integer cid , Model m ) {
		
		PhoneBook pb = pbs.SearchPhone(cid);
		
		if(pb != null) {
			m.addAttribute("pb", pb);
		}
		else {
			m.addAttribute("msg", "Customer not found");
		}
		
		return"SearchCustomer";
	}
	
	@GetMapping("/delete")
	public String DeleteCustomer(Model m ) {
		return"DeleteCustomer";
	}
	
	@PostMapping("/delcust")
	public String DeleteCustomer(@RequestParam("txtSearch") Integer cid , Model m) {
		
		String res = pbs.DeletePhoneBook(cid);
		
		if(res.equalsIgnoreCase("Success")) {
			m.addAttribute("msg", "Customer Deleted ......");
		}
		else {
			m.addAttribute("msg", "Customer Not Deleted ......");
		}
		
		return "DeleteCustomer";
		
	}
	
}
