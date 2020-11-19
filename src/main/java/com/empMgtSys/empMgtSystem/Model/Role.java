package com.empMgtSys.empMgtSystem.Model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Role {
	
	private long id;
	private String role;
	@DBRef
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
