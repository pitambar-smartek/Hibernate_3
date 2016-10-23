import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class CompositeIdApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();
	Account acc=new Account();
	acc.setAccountNo("ACC105");;
	acc.setAccountNoTwo("LOAN105");
	acc.setName("Rama");
	acc.setBalance(5600f);

	   session.getTransaction().begin();
	   session.save(acc);
	   session.getTransaction().commit();	
	   Account account=(Account)session.get(Account.class,acc);
	   System.out.println("Account details....");
	   System.out.println("Name is="+account.getName());
	   System.out.println("The Balance is="+account.getBalance());
	 session.close();
	}

}