package com.java.features.lombok;

import java.io.Serializable;

//@Data
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int departmentId;
	private String departmentName;
	private int age;
	
	
	public Employee() {
		
	}
	public Employee(int id, String name, int departmentId, String departmentName, int age) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}		
}
