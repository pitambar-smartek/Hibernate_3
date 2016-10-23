package com.pitambar.dao;
public class HourlyEmployee extends Employee
{
	private int workedHours;
	private double costPerHour;
	public void setWorkedHours(int workedHours)
	{
		this.workedHours=workedHours;
	}
	public int getWorkedHours()
	{
		return workedHours;
	}
	public void setCostPerHour(double costPerHour)
	{
		this.costPerHour=costPerHour;
	}
	public double getCostPerHour()
	{
		return costPerHour;
	}

}