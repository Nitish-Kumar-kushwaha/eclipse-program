package com.hibernate.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.connection.HibernateConfigure;
import com.hibernate.model.Employee;

public class EmpOperations {
	
	SessionFactory sfactroy = null;

	public EmpOperations() {
		sfactroy = HibernateConfigure.getconnection();
	}
	
	public void addEmployeee(Employee emp) {
		Session sObj = sfactroy.openSession();
		Transaction trns = sObj.beginTransaction();
		
		sObj.save(emp);
		trns.commit();
		
		sObj.close();
	}
	
	public List<Employee> showAll(){
		
		List<Employee> empAll = new ArrayList<Employee>();
		
		Session sObj = sfactroy.openSession();
		Query qry = sObj.createQuery("from Employee");
		empAll= qry.list();	
		return empAll;
	}
	
	public Employee SearchEmpBasedEmpNo(int eno) {
		Employee emp = null;
		
		Session sObj = sfactroy.openSession();
		Transaction trns = sObj.beginTransaction();
		Query qry = sObj.createQuery("from Employee empno = :eno");
		List<Employee> empall = qry.list();
		
		if(!empall.isEmpty()) {
			for(Employee e : empall) {
				emp = e;
			}
		}
		trns.commit();
		sObj.close();
		
		return emp;
	}
	
	public int DeleteEmployee(int eno) {
		Session sobj = sfactroy.openSession();
		Transaction trns = sobj.beginTransaction();
		Query qry = sobj.createQuery("Delete from Employee where empno =:eno");
		qry.setInteger("eno", eno);
		int res = qry.executeUpdate();
		trns.commit();
		return res;
		
	}
	
	

}
