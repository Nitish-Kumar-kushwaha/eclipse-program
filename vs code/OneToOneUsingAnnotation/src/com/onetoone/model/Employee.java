package com.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity

@Table(name = "Emps")
public class Employee {
	
	@Id
	@GeneratedValue
	@PrimaryKeyJoinColumn
	private int eno;
	
	@Column(name = "EmployeeName")
	private String ename; 
	
	@Column(name = "Desgination")
	private String job;
	
	
	private float salary;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address adrs;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
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
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	

}
