package com.pitambar.dao;

public class Employee {
	private int empno;
	private String name;
	private float salary;
	private int deptno;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getDeptno() {
		return deptno;
	}

}