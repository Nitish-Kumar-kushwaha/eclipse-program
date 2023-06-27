package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StdApp {
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		
		Student std1 = (Student)factory.getBean("stdObj1");
		System.out.println("roll No : " + std1.getRollno());
		System.out.println("Name : " + std1.getSname());
		System.out.println("Course : " + std1.getCourse());
		System.out.println("Fees : " + std1.getFees());
		
		System.out.println();
		
		Student std2 = (Student)factory.getBean("stdObj2");
		System.out.println("roll No : " + std2.getRollno());
		System.out.println("Name : " + std2.getSname());
		System.out.println("Course : " + std2.getCourse());
		System.out.println("Fees : " + std2.getFees());
	}

}
