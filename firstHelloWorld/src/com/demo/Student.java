package com.demo;


//Write a program for student details, Roll number, name and 3 subjects marks, calculate total, percentage and grade of the student. 

//Create a class "Student"  the define relevent methods,  test this class for two students

public class Student {
	int rollNum;
	String name;
	int math, chem, physics;
	public Student(int rollNum, String name, int math, int chem, int physics) {
		this.rollNum = rollNum;
		this.name = name;
		this.math = math;
		this.chem = chem;
		this.physics = physics;
	}
	
	private String grade( float percntage) {
		if(percntage>=91)
			return "A1 grade";
		else if(percntage >=81 && percntage<=90) {
			return "A2 grade";
		}
		else if(percntage >=71 && percntage<=80) {
			return "B1 grade";
		}
		else if(percntage >=61 && percntage<=70) {
			return "B2 grade";
		}
		else if(percntage >=51 && percntage<=60) {
			return "C1 grade";
		}
		else if(percntage >=41 && percntage<=50) {
			return "C2 grade";
		}
		else{
			return "D grade";
		}
		
	}
	
	public void total() {
		int sum = math+chem+physics;
		float percntage = (((float)sum)/300)*100;
		System.out.println("totla marks is : "+ sum+ "\n Percntage is : "+ percntage);
		System.out.println("Grade is " + grade(percntage));
	}
	
	

}
