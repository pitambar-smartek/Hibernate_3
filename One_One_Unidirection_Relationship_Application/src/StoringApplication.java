import java.io.Serializable;

import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountPlus;
import com.pitambar.dao.SessionUtil;

public class StoringApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();
	AccountPlus aplus=new AccountPlus();
             aplus.setLocation("Pune");
	 aplus.setType("saving");
	 Account acc=new Account();
	 acc.setName("Damodar");
	 acc.setBalance(4100f);
	 acc.setAccountPlus(aplus);
	 System.out.println(acc.getAccountPlus().getLocation());
	 System.out.println(acc.getAccountPlus().getType());

	session.getTransaction().begin();
	 session.save(acc);
	 session.getTransaction().commit();

	

	 System.out.println("The persistent object is persisted");
	 
	 //System.out.println(acc.get)
	 session.close();
	}

}