package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.connection.HibernateConfigure;
import com.model.Products;

public class ProductDao {
	
	private SessionFactory sessionFactory;
	
	public ProductDao() {
		
		sessionFactory = HibernateConfigure.getconnection();
	}
	
	public String saveProduct(Products pro) {
		String res = null;
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		int i= (Integer)session.save(pro);
		
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
	
	public List<Products> ShowAll() {
	    List<Products> proAll = new ArrayList<Products>();
	    Session session = sessionFactory.openSession();
	    Query qry = session.createQuery("from Products");
	    proAll = qry.list();
	    session.close();
	    return proAll;
	}
	
	public Products searchProduct(int id) {
		Products pro = null;
		
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		Query qry = session.createQuery("from Products where id = :id");
//		qry.setInteger("id", id);
		qry.setParameter("id", id);
		List<Products> proList = qry.list();
		
		if(!proList.isEmpty()) {
			for(Products p : proList) {
				pro = p;
			}
		}
		tnx.commit();
		session.close();
		
		return pro;
	}
	
	public String Update(Products pro) {
		String res = null;
		
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		
		System.out.println(pro);
		
		Query qry = session.createQuery("update Products set name = :a , price = :b where id = :c");
		qry.setParameter("a", pro.getName());
		qry.setParameter("b", pro.getPrice());
		qry.setParameter("c", pro.getId());
		
		int status = qry.executeUpdate();
		tnx.commit();
		
		if(status>0) {
			res = "Success";
		}
		else {
			res = "Error";
		}
		
		return res;
		
	}
	
	

}
