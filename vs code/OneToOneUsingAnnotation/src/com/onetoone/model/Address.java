package com.onetoone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AddressInfo")
public class Address {
	
	@Id
	@GeneratedValue
	private int adrsid;
	
	@Column(name = "DoorNo")
	private String doorno; 
	
	@Column(name="Location")
	private String location;
	
	@OneToOne(targetEntity = Employee.class)
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
