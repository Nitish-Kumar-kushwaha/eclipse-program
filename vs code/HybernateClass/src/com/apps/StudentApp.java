package com.apps;

import java.util.List;

import com.curdoperation.StudentOperation;
import com.model.Student;

public class StudentApp {
	public static void main(String[] args) {
		StudentOperation stdOp = new StudentOperation();
		List<Student> sop= stdOp.showAll();
		for(Student s : sop) {
			System.out.println(s.getRollNo()+"\t"+s.getStdname()+"\t"+s.getCources()+"\t"+s.getFees());
		}
	}
}
