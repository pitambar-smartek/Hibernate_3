import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();

		SQLQuery query = (SQLQuery) session
				.createSQLQuery("select *  from account  where balance>8000");
		query.addEntity(Account.class);

		List<Account> accounts = query.list();
		for (Account acc : accounts) {
			System.out.println(acc.getAccountNo() + "\t" + acc.getName() + "\t"
					+ acc.getBalance());
		}
		session.close();
	}
}
