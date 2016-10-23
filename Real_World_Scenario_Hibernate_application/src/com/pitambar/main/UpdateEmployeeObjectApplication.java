package com.pitambar.main;

import org.hibernate.classic.Session;

import com.pitambar.persistence.Employee;
import com.pitambar.util.HibernateUtil;

public class UpdateEmployeeObjectApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, 101);
		
		employee.getPhones()[0] = 1234;
		employee.getLocations().set(1, "Delhi");
		session.getTransaction().commit();
		System.out.println("update successfull in employee object");
		

	}

}
