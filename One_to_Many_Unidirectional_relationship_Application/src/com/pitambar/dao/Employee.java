package com.pitambar.dao;

public class Employee {
	private int eid;
	private String ename;
	private double esal;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public double getEsal() {
		return esal;
	}

}