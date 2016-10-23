package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.hibernate.context.CurrentSessionContext;

import com.util.HibernateUtil;

public class Temp implements CurrentSessionContext {

	@Override
	public Session currentSession() throws HibernateException {
		// TODO Auto-generated method stub
		return HibernateUtil.getSessionFactory().openSession();
	}

}
