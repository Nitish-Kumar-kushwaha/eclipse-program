package com.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpApp {
	
	public static void main(String[] args){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		Employee emp = new Employee();
		emp.setEmpno(1003);
		emp.setEname("Rashu Kumar Kushwaha");
		emp.setJob("Frontened developer");
		emp.setSalary(10000.00f);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session sessionObj = sf.openSession();
		/*
		 * Transaction class is used whenever adding, modifing and deleting data 
		 */
		Transaction t = sessionObj.beginTransaction();
		sessionObj.save(emp);  // sending data to db
		t.commit();
		sessionObj.close();
		sf.close();	
		System.out.println("Emp App");
	}

}
