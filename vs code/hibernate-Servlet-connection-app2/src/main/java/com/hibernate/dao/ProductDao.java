package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import org.hibernate.SessionFactory;

import com.hibernate.connection.HibernateConfigure;
import com.hibernate.model.Products;

public class ProductDao {
	
	private SessionFactory sessionFactory;

	public ProductDao() {
		sessionFactory = HibernateConfigure.getconnection();
		
	}
	
	public String saveProduct(Products p) {
		
		String res = null;
		
		Session session = sessionFactory.openSession();
		
		Transaction tnx = session.beginTransaction();
		
		int i= (Integer)session.save(p);
		
		if(i>0) {
			res="sucess";
		}
		else {
			res = "error";
		}
		
		tnx.commit();
		session.close();
		
		return res;
		
	}
	
	public List<Products> showAll(){
		
		List<Products> prodAll = new ArrayList<Products>();
		
		Session session  = sessionFactory.openSession();
		Query qry = session.createQuery("from Products");
		
		prodAll = qry.list();
		
		return prodAll;
	}

}
