package com.Dao;

public class Daomain {
	public static void main(String[] args) {
		ProductsDao dao = new ProductsDao();
		Products p= dao.search(10);
		
		if(p== null) {
			System.out.println("error");
		}
		else {
			System.out.println(p);
		}
		
	}

}
