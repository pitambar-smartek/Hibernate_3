package com.pitambar.dao;
public class SalariedEmployee extends Employee
{
	double sal;
	public void setSalary(double sal)
	{
		this.sal=sal;
	}
	public double getSalary()
	{
		return sal;
	}
}