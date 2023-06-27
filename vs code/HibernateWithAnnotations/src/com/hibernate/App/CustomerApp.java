package com.hibernate.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.models.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		Customer cust = new Customer();
		cust.setCid(1001);
		cust.setCname("Nitish Kumar kushwha");
		cust.setEmail("Nitish@gmail.in");
		cust.setPhone("9919930511");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sobj = sf.openSession();
		Transaction trns = sobj.beginTransaction();
		
		sobj.save(cust);
		trns.commit();
		
		sobj.close();
		sf.close();
		
		System.out.println("data is saved");
	}
	

}
