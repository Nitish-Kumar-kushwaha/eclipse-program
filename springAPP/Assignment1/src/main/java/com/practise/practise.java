package com.practise;

import java.util.List;

import com.Services.ProductService;
import com.model.Products;

public class practise {
	public static void main(String[] args) {
		ProductService dao = new ProductService();
//		Products pro = new Products("phone",233);
//		dao.InsertProduct(pro);
		
		List<Products>  p  = dao.ShowProducts();
		
		for(Products prod :p ) {
			System.out.println(prod);
		}
		
		Products prop = dao.SearchProduct(2);
		System.out.println(prop);
	}
}
