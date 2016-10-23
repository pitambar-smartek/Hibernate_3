import org.hibernate.Session;

import com.pitambar.dao.AccountPlus;
import com.pitambar.dao.SessionUtil;

public class ReadApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();
	 AccountPlus acc=(AccountPlus)session.get(AccountPlus.class,8);
	   System.out.println("The account no"+acc.getAccountNo());
	   System.out.println("The name is"+acc.getAccount().getName());
	   System.out.println("The balance is"+acc.getAccount().getBalance());
	   System.out.println("The location is"+acc.getLocation());
	   System.out.println("The account type is"+acc.getType());

	
	 session.close();
	}

}