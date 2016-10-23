package com.pitambar.dao;

import java.util.List;

public class Department {
	private int deptno;
	private String deptname;
	private String location;
	private List<Employee> employeeList;

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}
}