import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();
	   Account acc=(Account)session.get(Account.class,5);
	   System.out.println("The account no"+acc.getAccountNo());
	   System.out.println("The name is"+acc.getName());
	   System.out.println("The balance is"+acc.getBalance());
	   System.out.println("The location is"+acc.getAccountPlus().getLocation());
	   System.out.println("The account type is"+acc.getAccountPlus().getType());

	
	 session.close();
	}

}