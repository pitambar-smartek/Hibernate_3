import java.io.Serializable;

import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountPlus;
import com.pitambar.dao.SessionUtil;

/**
 * @author Admin
 * t
 *
 */
public class StoringApplication
{
	/**
	 * @param String[] args
	 * 
	 */
	public static void main(String args[])
	{
		Session session=SessionUtil.getSession();
		AccountPlus aplus=new AccountPlus();
	      aplus.setLocation("Pune");
		 aplus.setType("saving");
		 Account acc=new Account();
		 acc.setName("Pitambar");
		 acc.setBalance(8500f);
	aplus.setAccount(acc);
		

		session.getTransaction().begin();
		 Serializable id=session.save(aplus);
		 session.getTransaction().commit();

		

		 System.out.println("The persistent object is persisted"+id);
		 
		 //System.out.println(acc.get)
		 session.close();
	}

}