package com.onetoone.model;

public class Address {
	
	private int adrsid;
	private String doorno, location;
	private Employee emp;
	
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getAdrsid() {
		return adrsid;
	}
	public void setAdrsid(int adrsid) {
		this.adrsid = adrsid;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	

}
