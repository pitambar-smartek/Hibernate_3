package com.pitambar.dao;
public class Employee
{
	private int empno;
	private int deptno;
	private String name;
	private float salary;
	private Address addr;
	
	//Setters and getters

	public void setEmpno(int empno)
	{
		this.empno=empno;
	}
	public int getEmpno()
	{
		return empno;
	}
	public void setDeptno(int deptno)
	{
		this.deptno=deptno;
	}
	public int getDeptno()
	{
		return deptno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setAddr(Address addr)
	{
		this.addr=addr;
	}
	public Address getAddr()
	{
		return addr;
	}
}