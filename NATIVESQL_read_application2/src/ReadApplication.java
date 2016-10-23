import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();

		SQLQuery query = session
				.createSQLQuery("select avg(balance)  as avgbal from account");

		query.addScalar("avgbal", Hibernate.FLOAT);

		float avgbal = (Float) query.uniqueResult();

		System.out.println("The Average balance=" + avgbal);

		session.close();

	}
}
