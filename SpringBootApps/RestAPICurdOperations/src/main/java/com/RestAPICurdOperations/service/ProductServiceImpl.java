package com.RestAPICurdOperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestAPICurdOperations.model.Product;
import com.RestAPICurdOperations.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo prepo;
	
	@Override
	public String AddNewProduct(Product prod) {
		
		Product p = prepo.save(prod);
		
		if(p!= null) {
			return "Success";
		}
		
		return "Error";
	}

	@Override
	public List<Product> ShowAll() {
		
		return prepo.findAll();
	}

	@Override
	public Product GetAProduct(int prdId) {
		Optional<Product> pinfo = prepo.findById(prdId);
		if(pinfo.isPresent()) {
			return pinfo.get();
		}
		return null;
	}

	@Override
	public String UpdateProduct(Product prod) {
		Product p = prepo.saveAndFlush(prod);
		if(p!= null) {
			return"Success";
		}
		return "Error";
	}

	@Override
	public String DeleteProduct(int prdId) {
		Optional<Product> pinfo = prepo.findById(prdId);
		
		if(pinfo.isPresent()) {
			prepo.deleteById(prdId);
			return "Success";
		}
		return "Error";
	}

}
