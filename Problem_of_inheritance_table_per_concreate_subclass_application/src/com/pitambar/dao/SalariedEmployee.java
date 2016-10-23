package com.pitambar.dao;
public class SalariedEmployee extends Employee
{
	double sal;
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public double getSal()
	{
		return sal;
	}
}