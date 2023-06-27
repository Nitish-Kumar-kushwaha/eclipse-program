package com.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Services.ProductService;
import com.model.Products;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String home(Model m) {
		return "index";
	}
	
	@GetMapping(value = "/show")
	public ModelAndView show( Model m1){
		ModelAndView m = new ModelAndView();
		
		ProductService service = new ProductService();
		List<Products> pros = service.ShowProducts();
		System.out.println(pros);
		m1.addAttribute("p",pros);
		m.addObject("products", pros);
		
		m.setViewName("show");
		return m;
	}
	
	@GetMapping(value = "/insert")
	public ModelAndView insert() {
		ModelAndView m = new ModelAndView();
		
		m.setViewName("insert");
		return m;
	}
	
	@PostMapping(value = "/insert")
	public ModelAndView insert(@ModelAttribute Products props) {
		ModelAndView m = new ModelAndView();
		
		ProductService service  = new ProductService();
		service.InsertProduct(props);
		System.out.println(props);
		System.out.println("inserted");
		
		m.setViewName("insert");
		return m;
	}
	
	@GetMapping(value = "/search")
	public ModelAndView search() {
		ModelAndView m = new ModelAndView();
		
		
		m.setViewName("search");
		 return m;
	}
	
	@PostMapping(value = "/search")
	public ModelAndView search(@RequestParam("productId") String id, HttpSession session ) {
		ModelAndView m = new ModelAndView();
		ProductService service = new ProductService();
		
		int pId = Integer.parseInt(id);
		 
		
		Products pro = service.SearchProduct(pId);
		
		if(pro == null) {
			m.addObject("msg","id not exixts");
		}
		else {
			m.addObject("pmsg", pro);
			session.setAttribute("prod", pro);
		}
		
		
		m.setViewName("search");
		 return m;
	}
	
	
	@GetMapping(value = "/update")
	public ModelAndView update(HttpSession session) {
		ModelAndView m = new ModelAndView();
		
		Products prop = (Products)session.getAttribute("prod");
		m.addObject("pro", prop);
		
		
		m.setViewName("update");
		return m;
	}
	
	@PostMapping(value = "/update")
	public ModelAndView update(@ModelAttribute Products pro) {
		ModelAndView m = new ModelAndView();
		System.err.println(pro);
		ProductService service = new ProductService();
		
		String res = service.ProductUpdate(pro);
		
		if(res.equals("Success")) {
			System.out.println("product updated");
		}
		else {
			System.err.println("not updated");
		}
		
		m.setViewName("search");
		return m;
	}

}
