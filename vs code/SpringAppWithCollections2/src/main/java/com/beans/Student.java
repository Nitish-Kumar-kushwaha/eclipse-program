package com.beans;

import java.util.*;

public class Student {
	private String sname;
	private String location;
	private Cource cource;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Cource getCource() {
		return cource;
	}
	public void setCource(Cource cource) {
		this.cource = cource;
	}
	
	public void PrintStdInfo() {
		System.out.println("Student Name : "+ this.getSname());
		System.out.println("Location : "+ this.getLocation());
		System.out.println("Cource name : "+ this.getCource().getCname());
		System.out.println("duration : "+ this.getCource().getDuration());
		System.out.println("fees : "+ this.getCource().getFees() );
	}
	
	
	
	

}
