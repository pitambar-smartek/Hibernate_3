import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();
		SQLQuery query = session.createSQLQuery("{call Changebal(?,?)}");
		query.setParameter(0, 101);
		query.setParameter(1, 15720f);
		session.getTransaction().begin();
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Account is updated");
		session.close();
	}
}
