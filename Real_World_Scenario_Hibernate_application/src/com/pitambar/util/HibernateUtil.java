package com.pitambar.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory;
	static{
		Configuration cfg = new Configuration();
		cfg.configure();
		
//		cfg.configure("myhibernate.cfg.xml");
		
		factory = cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory(){
		
		return factory;
	}
	

}


