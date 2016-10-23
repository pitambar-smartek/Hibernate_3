package com.pitambar.dao;
import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
public class SessionUtil{
	public static SessionFactory sessionFactory;
	static{
		Configuration cfg = new Configuration();
		cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
	}
    public static Session getSession(){
		return sessionFactory.openSession();
	}
}