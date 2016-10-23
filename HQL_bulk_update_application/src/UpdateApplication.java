import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class UpdateApplication {
	public static void main(String[] args) {
		String hql = "update   Account a   set a.balance=a.balance +500";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);
		session.getTransaction().begin();
		int c = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("The no. of account is updated is:= " + c);
		session.close();
	}
}
