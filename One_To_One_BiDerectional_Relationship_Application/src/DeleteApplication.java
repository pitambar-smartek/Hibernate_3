import org.hibernate.Session;

import com.pitambar.dao.AccountPlus;
import com.pitambar.dao.SessionUtil;
public class DeleteApplication
{
	public static void main(String args[])
	{
	

	Session session=SessionUtil.getSession();
	AccountPlus aplus=(AccountPlus)session.get(AccountPlus.class,7);
	session.getTransaction().begin();
	session.delete(aplus);
	session.getTransaction().commit();
	System.out.println("The   persistent object is deleted");
	session.close();
	}
}