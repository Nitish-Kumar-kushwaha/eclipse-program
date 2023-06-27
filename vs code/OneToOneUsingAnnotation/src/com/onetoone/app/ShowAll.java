package com.onetoone.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.model.Address;
import com.onetoone.model.Employee;

public class ShowAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sobj = sf.openSession();
		Transaction trnx = sobj.beginTransaction();
		
		TypedQuery qry = sobj.createQuery("from Employee");
		List<Employee> empall = qry.getResultList();
		
		for(Employee e : empall) {
			System.out.println("Employee Info");
			System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+ e.getJob()+"\t"+e.getSalary());
			System.out.println("Address Info");
			Address adrs = e.getAdrs();
			System.out.println(adrs.getAdrsid()+"\t"+adrs.getDoorno()+"\t"+adrs.getLocation());
		}
		
		trnx.commit();
		
		sobj.close();
		sf.close();
	}

}
