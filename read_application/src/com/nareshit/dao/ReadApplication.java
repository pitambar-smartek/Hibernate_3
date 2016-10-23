package com.nareshit.dao;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApplication {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure(new File("C:\\Users\\Admin\\hibernateApplication\\read_application\\src\\com\\nareshit\\dao\\hibernate.cfg.xml"));
		SessionFactory  factroy=config.buildSessionFactory();
		Session session=factroy.openSession();
		System.out.println(session);
		String acccountNo="ACC101";
		Account acc=(Account) session.get(Account.class, 4785);
	
		System.out.println(acc);
		if(acc==null){
			System.out.println("Account does not exists");
		}else{
			System.out.println("Accountno="+acc.getAccountNo());
		}
		
		

	}

}
