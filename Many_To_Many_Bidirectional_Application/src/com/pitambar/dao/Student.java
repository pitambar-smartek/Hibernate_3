package com.pitambar.dao;
import java.util.ArrayList;
import java.util.List;
public class Student
{
	private int sno;
	private String sname;
	private List<Course> courseList= new ArrayList<Course>();

	public void setCourseList(List<Course> courseList)
	{
		this.courseList=courseList;
	}
	public List<Course> getCourseList()
	{
		return courseList;
	}
	public void setSno(int sno)
	{
		this.sno=sno;
	}
	public int getSno()
	{
		return sno;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}
}