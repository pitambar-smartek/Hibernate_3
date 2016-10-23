package com.pitambar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=null;
		Session session=null;
		Transaction trn=null;
		try{
		Configuration config=new Configuration();
		config.configure();
	    factory=config.buildSessionFactory();
		session=factory.openSession();
		Account acc=new Account();
		acc.setAccountNo("ACC104");
		acc.setBalance(12000);
		acc.setName("Ugrasen");
		trn=session.beginTransaction();
		
		session.save(acc);
		trn.commit();
		System.out.println("object is saved propery and transcation is successfull");
		}catch(Exception e){
			if(trn!=null){
			trn.rollback();
			System.out.println("transcation is rollbacked");
			}
			e.printStackTrace();
			
			
		}finally{
			if(factory!=null)
			{
				factory.close();
			}
			if(session!=null){
				session.close();
			}
		}

	}

}
