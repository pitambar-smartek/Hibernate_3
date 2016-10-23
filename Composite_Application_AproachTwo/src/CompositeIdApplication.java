import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountId;
import com.pitambar.dao.SessionUtil;

public class CompositeIdApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();

	AccountId accountId=new AccountId();
	accountId.setAccountNo("ACC106");;
	accountId.setAccountNoTwo("LOAN106");;
	Account acc=new Account();
	
	acc.setAccountId(accountId);
	acc.setName("Laxman");
	acc.setBalance(56000f);

	   session.getTransaction().begin();
	   session.save(acc);
	   session.getTransaction().commit();	

	   System.out.println("Account object is persisted");
	   Account account=(Account)session.get(Account.class,accountId);
	   System.out.println("Account Details");

	   System.out.println("Name is="+account.getName());
	   System.out.println("Balance Rs="+account.getBalance());
	 session.close();
	}

}