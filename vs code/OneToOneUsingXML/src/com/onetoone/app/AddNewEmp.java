package com.onetoone.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.model.Address;
import com.onetoone.model.Employee;

public class AddNewEmp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		Employee emp1 = new Employee();
		emp1.setEname("Nitish Kumar Kushwaha");
		emp1.setJob("Frontend Developer");
		emp1.setSalary(1000000.0f);
		
		Address adrs1 = new Address();
//		adrs1.setAdrsid(10001);
		adrs1.setDoorno(" plot no -10");
		adrs1.setLocation("Lucknow");
		
		emp1.setAdrs(adrs1);
		adrs1.setEmp(emp1);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sobj = sf.openSession();
		Transaction trnx = sobj.beginTransaction();
//		sobj.save(emp1);
//		sobj.save(adrs1);
		sobj.persist(emp1);
		sobj.persist(adrs1);
		
		trnx.commit();
		
		sobj.close();
		sf.close();
		
		System.out.println("Employee Info is saved ........");
		
	}

}
