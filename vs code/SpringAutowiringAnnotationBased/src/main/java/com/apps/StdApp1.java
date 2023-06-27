package com.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class StdApp1 {
	 public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config1.xml");
		
		Student std1 = (Student)app.getBean("stdObj");
		
		std1.PrintStdInfo();
		
		
		
	}
}
