package com.pitambar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil 
{
	public static SessionFactory sf=null;
	static{
		Configuration c=new  Configuration();
		c.configure();
		sf=c.buildSessionFactory();
	}
	public static Session getSession()
	{	
	return sf.openSession();
	}//user defined method
}//class end
