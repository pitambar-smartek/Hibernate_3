package com.pitambar.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class AccountDAOImpl implements AccountDAO
{
	public void storeAccount(Account acc)
	{
		Session session=SessionUtil.getSession();
		Transaction tnx=session.beginTransaction();
		session.save(acc);
		tnx.commit();
		session.close();
	}
	public  Account findAccount(String ano)
	{
		Account acc=null;
		Session session=SessionUtil.getSession();
		acc=(Account)session.get(Account.class,ano);
		session.close();
		return acc;
	}

	public boolean deleteAccount(String ano)
	{
		boolean flag=true;
		Session session=SessionUtil.getSession();
	
		Account acc=findAccount(ano);
		if(acc==null)
			flag=false;
		else{
		Transaction tnx=session.beginTransaction();
		session.delete(acc);
		tnx.commit();
		session.close();
		}
		return flag;
	}
	public void updateAccount(Account acc)
	{
		Session session=SessionUtil.getSession();
		Transaction tnx=session.beginTransaction();
		session.update(acc);
		tnx.commit();
		session.close();
	}
}