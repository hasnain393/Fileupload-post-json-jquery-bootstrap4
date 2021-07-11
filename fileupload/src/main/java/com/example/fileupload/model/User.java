package com.example.fileupload.model;

public class User {

	private String name;
	private String employeeID;
	private String role;
	
	
	public User() {
		super();
	}

	public User(String name, String employeeID, String role) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
