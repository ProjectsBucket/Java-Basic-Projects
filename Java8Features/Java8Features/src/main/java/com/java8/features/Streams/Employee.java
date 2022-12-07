package com.java8.features.Streams;


public class Employee {
	private int id;
	private String name;
	private String emailId;
	private String department;
	private int salary;
	
	public Employee(int id, String name, String emailId, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
