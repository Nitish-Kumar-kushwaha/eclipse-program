package com.beans;

import java.util.*;

public class Student {
	private String sname;
	private List <String> qualifications;
	private Set<String> cources;
	private Map <String , String> cource_an_Faculity;
	private Properties cource_and_cost;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Properties getCource_and_cost() {
		return cource_and_cost;
	}
	public void setCource_and_cost(Properties cource_and_cost) {
		this.cource_and_cost = cource_and_cost;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	} 
	public Set<String> getCources() {
		return cources;
	}
	public void setCources(Set<String> cources) {
		this.cources = cources;
	} 
	public Map<String, String> getCource_an_Faculity() {
		return cource_an_Faculity;
	}
	public void setCource_an_Faculity(Map<String, String> cource_an_Faculity) {
		this.cource_an_Faculity = cource_an_Faculity;
	}
	
	public void PrintStudentInfo() {
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Student Qualifications"  + this.getQualifications());
		System.out.println("cource info" + this.getCources());
		System.out.println("Cource and Faculity" + this.getCource_an_Faculity());
		System.out.println("cource and cost" + this.getCource_and_cost());
		
	}
	
	

}
