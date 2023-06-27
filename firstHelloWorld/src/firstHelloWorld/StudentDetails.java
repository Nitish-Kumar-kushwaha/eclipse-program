package firstHelloWorld;

import java.lang.*;
import java.util.*;
import com.demo.Student;

//Write a program for student details, Roll number, name and 3 subjects marks, calculate total, percentage and grade of the student. 

//Create a class "Student"  the define relevent methods,  test this class for two students

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		Student s1  = new Student(1, "nitish",90,92,89);
		s1.total();
		
		

	}

}
