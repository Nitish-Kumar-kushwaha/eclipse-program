package com.beans;

public class Employee {
	private String ename;
	private String job;
	private float salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String ename, String job, float salary) {
		super();
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}
	
	

}
