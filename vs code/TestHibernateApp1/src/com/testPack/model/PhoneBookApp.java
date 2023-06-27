package com.testPack.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import org.hibernate.Session;

public class PhoneBookApp {
	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();
		pb.setCid("1001");
		pb.setCname("Nitish Kumar Kushwaha");
		pb.setEmail("nitishkumar@gmail.com");
		pb.setPhone("8429128085");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sessionObj = sf.openSession();
		
		Transaction trns = sessionObj.beginTransaction();
		sessionObj.save(pb);
		trns.commit();
		sessionObj.close();
		sf.close();
		
		System.out.println("customer detail has been updated");
		
		
	}

}
