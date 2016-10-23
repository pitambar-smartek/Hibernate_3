import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();
		SQLQuery query = (SQLQuery) session
				.createSQLQuery("select *  from account ");
		query.addScalar("name", Hibernate.STRING);
		query.addScalar("balance", Hibernate.FLOAT);
		List<Object[]> accounts = query.list();
		System.out.println(accounts.size());
		for (Object arr[] : accounts) {
			for (Object o : arr) {
				System.out.print(o + "\t");
			}
			System.out.println();
		}
		session.close();
	}
}
