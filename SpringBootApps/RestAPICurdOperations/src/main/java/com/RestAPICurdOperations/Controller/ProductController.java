package com.RestAPICurdOperations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPICurdOperations.model.Product;
import com.RestAPICurdOperations.service.ProductService;

@RestController
@RequestMapping("/v1/api")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> ViewAll(){
		List<Product> pall = ps.ShowAll();
		
		if(pall.isEmpty()) {
			return new ResponseEntity("List is empty..!!", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(pall , HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> SaveProduct(@RequestBody Product prod){
		String res = ps.AddNewProduct(prod);
		if(res.equals("Success")) {
			return new ResponseEntity<String>("Product Added.!!!", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product Not Added.!!!", HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> ViewOneProduct(@PathVariable Integer id){
		Product prd = ps.GetAProduct(id);
		System.out.println(ps.GetAProduct(2));
		
		if(prd == null) {
			return new ResponseEntity("List is empty..!!", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Product>(prd , HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> DeleteProduct(@PathVariable Integer id){
		String str = ps.DeleteProduct(id);
		if(str.equals("Success")) {
			return new ResponseEntity<String>("Product Deleted .!!", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Invalid product ID .!!!", HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<String> UpdateProduct(@RequestBody Product prod, @PathVariable Integer id){
		if(ps.GetAProduct(id) != null) {
			String res = ps.UpdateProduct(prod);
			if(res.equals("Success")) {
				return new ResponseEntity<String>("Product Updated ....", HttpStatus.OK);
			}
			return new ResponseEntity<String>("Product Not Updated ....", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product Updated ....", HttpStatus.NOT_FOUND );
	}

}