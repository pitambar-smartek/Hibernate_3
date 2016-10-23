package com.pitambar.dao;
import java.util.List;
public class Course
{
	private int cno;
	private String cname;
	private List<Student> studentList;

	public void setStudentList(List<Student> studentList)
	{
		this.studentList=studentList;
	}
	public List<Student> getStudentList()
	{
		return studentList;
	}
	public void setCno(int cno)
	{
		this.cno=cno;
	}
	public int getCno()
	{
		return cno;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public String getCname()
	{
		return cname;
	}
}