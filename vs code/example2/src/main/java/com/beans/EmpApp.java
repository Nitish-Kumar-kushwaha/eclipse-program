package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpApp {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		
		Employee empinfo = (Employee)factory.getBean("empObj");
		 System.out.println("Employee numbern :"  + empinfo.getEmpno());
		 System.out.println("Employee name: " + empinfo.getEname());
		 System.out.println("Emplyee job : " + empinfo.getJob());
		 System.out.println("Employee Salary : "+ empinfo.getSalary());
	}

}
