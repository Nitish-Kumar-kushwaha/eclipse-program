package com.curdoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Connection.DbConnection;
import com.model.Student;

public class StudentOperation {
	Connection conObj = null;

	public StudentOperation() {
		
		conObj = DbConnection.GetConnection();
		
		
	}
	
	public String AddNewStudent(Student std) {
		
		String res = "Error";
		try {
			
			PreparedStatement ps = conObj.prepareStatement("Insert into Student(rollNo, stdname, cources, fees)values(?,?,?,?)");
			ps.setString(1, std.getStdname());
			ps.setString(2, std.getCources());
			ps.setFloat(3, std.getFees());
			
			int r = ps.executeUpdate();
			
			if(r>=1) {
				res = "Success";
			}
			
		}catch(Exception ex) {
			res = "Error"  +ex.getMessage();
		}
		
		return res;
		
	}
	
	public List<Student> showAll(){
		
		List<Student > stdinfo = new ArrayList<Student>();
		try {
			PreparedStatement ps = conObj.prepareStatement("Select * from Student");
			ResultSet rs = ps.executeQuery();
			Student std = null;
			
			while(rs.next()) {
				std = new Student();
				std.setRollNo(rs.getInt("rollNo"));
				std.setStdname(rs.getString("stdname"));
				std.setCources(rs.getString("cources"));
				std.setFees(rs.getFloat("fees"));
				
				stdinfo.add(std);
				
			}
		}catch(Exception ex) {
			System.out.println(ex);
			
		}
		
		return stdinfo;
	}
	
	public Student SearchStudentBasedOnRollno(int rollno) {
		Student std = null;
		
		try {
			
			PreparedStatement ps = conObj.prepareStatement("Select * from Student where = ?");
			ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				std = new Student();
				std.setRollNo(rs.getInt("rollNo"));
				std.setStdname(rs.getString("stdname"));
				std.setCources(rs.getString("cources"));
				std.setFees(rs.getFloat("fees"));
			}
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		
		return std;
	}
	
	

}
