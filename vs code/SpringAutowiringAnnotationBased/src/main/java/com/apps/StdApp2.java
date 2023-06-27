package com.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;
import com.beans.Student2;

public class StdApp2 {
	 public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("config2.xml");
		
		Student2 std1 = (Student2)app.getBean("stdObj2");
		
		std1.PrintStdInfo();
		
		
		
	}
}
