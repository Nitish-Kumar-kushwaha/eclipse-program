package practise;

import java.util.List;

import com.hibernate.dao.ProductDao;
import com.hibernate.model.Products;

public class show {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		List<Products>  p  = dao.showAll();
		
		for(Products prod :p ) {
			System.out.println(prod);
		}
	}

}
