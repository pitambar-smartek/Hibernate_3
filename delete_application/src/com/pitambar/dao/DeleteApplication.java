package com.pitambar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=null;
		Session session=null;
		Transaction trn=null;
		try{
		Configuration cnfg=new Configuration();
		cnfg.configure();
		 factory=cnfg.buildSessionFactory();
		 session=factory.openSession();
		 trn=session.beginTransaction();
		 Account acc=(Account) session.get(Account.class, "ACC104");
		 
		  session.delete(acc);
		 
		 trn.commit();
		 System.out.println("One Record is deleted successfulll and transcation is successfull");
		 
		}catch(Exception e){
			if(trn!=null){
				trn.rollback();
				System.out.println("Transcation is failure");
			}
			System.out.println("Trascation object is null");
			e.printStackTrace();
			
		}finally{
			if(session!=null){
				session.close();
			}if(factory!=null){
				factory.close();
			}
		}

	}

}
