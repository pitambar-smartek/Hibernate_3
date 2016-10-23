package com.pitambar.main;

import org.hibernate.classic.Session;

import com.pitambar.persistence.Employee;
import com.pitambar.util.HibernateUtil;

public class DeleteEmployeeObjectApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, 101);
		
		session.delete(employee);
		session.getTransaction().commit();
		

	}

}
