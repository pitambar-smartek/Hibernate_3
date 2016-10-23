package com.pitambar.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import com.pitambar.persistence.Contact;
import com.pitambar.persistence.Employee;
import com.pitambar.persistence.Project;
import com.pitambar.util.HibernateUtil;

public class StoreEmployeeObjectApplication {
	
	
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setName("John");
		employee.setDepartmentNumber(10);
		
		employee.setPhones(new int[]{999, 987, 977});
		
		Contact contact = new Contact("Office", 9981, "John@hotmail.com");
		
		Contact contact2 = new Contact("Work", 9971, "John@gmail.com");
		
		employee.setContacts(new Contact[]{contact, contact2});
		
		List<String> locations = new ArrayList<String>();
		locations.add("Pune");
		locations.add("Mumbai");
		employee.setLocations(locations);
		//System.out.println("Locations" +locations);
		
		Project project = new Project("Ra1", "Ra1");
		Project project2 = new Project("G1", "G1");
		
		Set<Project> projects = new HashSet<Project>();
		projects.add(project);
		projects.add(project2);
		
		employee.setProjects(projects);
	//	System.out.println("Projects" +projects);
		
		Collection<String> logs = new ArrayList<String>();
		logs.add("log1");
		logs.add("log2");
		
		employee.setLogs(logs);
	//	System.out.println("Logs" +logs);
		
		
		
		Collection<String> logsBackUp = new ArrayList<String>();
		logsBackUp.add("log1");
		logsBackUp.add("log2");
		
		employee.setLogsBackUp(logsBackUp);
		
		Map<String, String> tokens = new HashedMap();
		tokens.put("t1", "v1");
		tokens.put("t2", "v2");
		
		employee.setTokens(tokens);
		
		
		Map<String, String> extras = new HashedMap();
		extras.put("e1", "v1");
		extras.put("e2", "v2");
		
		employee.setExtras(extras);
		
		
		Map<String, Project> projMap = new HashedMap();
		projMap.put("e1", project);
		projMap.put("e2", project2);
		
		employee.setProjMap(projMap);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		//Transaction tx = session.beginTransaction();

		session.beginTransaction();
		
		try{
			
			session.save(employee);
			session.getTransaction().commit(); 
			System.out.println("Employee Object is inserted successfully in database");
			
			
		  }catch (HibernateException e) {
			
			e.printStackTrace();
			//session.getTransaction().rollback();
		}
		
		System.out.println(session.isConnected());
			
		
	}

}
