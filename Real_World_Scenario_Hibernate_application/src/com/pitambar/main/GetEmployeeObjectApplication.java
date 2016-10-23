package com.pitambar.main;

import org.hibernate.classic.Session;

import com.pitambar.persistence.Employee;
import com.pitambar.util.HibernateUtil;

public class GetEmployeeObjectApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, 101);
		
		
		
		System.out.println("Display Employee Details");
		employee.displayEmployeeDetails();
		System.out.println("The Emp object="+employee);
		session.close();
		

	}

}
