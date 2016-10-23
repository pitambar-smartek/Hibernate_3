package com.pitambar.dao;
public class  DAOFactory
{
	public static AccountDAO ad=new AccountDAOImpl();
	public static AccountDAO getAccountDAO()
	{
		return ad;
	}
}
/*
here if there are 5 DAO classes are there then only one DAOFactory class are there but 5 static method are there for 5 method
*/