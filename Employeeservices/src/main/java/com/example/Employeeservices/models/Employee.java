package com.example.Employeeservices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	
	private int departmentId;
	private String empname;
	
	
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	

	public Employee() {
		
	}

	public Employee(int id, String empname,int departmentId) {
		
		this.id = id;
		this.empname = empname;
		this.departmentId=departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + "]";
	}
	
	

}
