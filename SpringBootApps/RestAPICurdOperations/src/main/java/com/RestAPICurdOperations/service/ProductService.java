package com.RestAPICurdOperations.service;

import java.util.List;

import com.RestAPICurdOperations.model.Product;

public interface ProductService {
	
	public String AddNewProduct(Product prod);
	public List<Product> ShowAll();
	public Product GetAProduct(int prdId);
	public String UpdateProduct(Product prod);
	public String DeleteProduct(int prdId);

}
