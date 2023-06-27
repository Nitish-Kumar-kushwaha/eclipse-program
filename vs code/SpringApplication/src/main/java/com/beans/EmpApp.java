package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("configEmp.xml");
		
		Employee emp1 = (Employee)app.getBean("empObj");
		System.out.println("Ename : " + emp1.getEname());
		System.out.println("Job : " + emp1.getJob());
		System.out.println("Salary : " + emp1.getSalary());
	}
}
