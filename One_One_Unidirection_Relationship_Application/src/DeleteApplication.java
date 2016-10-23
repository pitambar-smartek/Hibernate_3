import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;
public class DeleteApplication
{
	public static void main(String args[])
	{
	Session session=SessionUtil.getSession();

	Account acc=(Account)session.get(Account.class,5);
	session.getTransaction().begin();
	session.delete(acc);
	session.getTransaction().commit();
	System.out.println("Persistent object is deleted successfull");
	session.close();
	}
}