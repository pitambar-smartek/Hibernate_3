import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class StoredProcedureApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();
		SQLQuery query = (SQLQuery) session.getNamedQuery("changebal");
		/*
		 * OR Query query=session.getNamedQuery("changebal");
		 */

		query.setParameter(0, 101);
		query.setParameter(1, 11000f);
		session.getTransaction().begin();
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Account is updated");
		session.close();
	}
}
