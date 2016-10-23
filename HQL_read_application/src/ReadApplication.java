import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.Account;

public class ReadApplication {
	public static void main(String[] args) throws Exception {
		String hql = "select a from Account a";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);

		List<Account> acc = query.list();
		for (Account a : acc) {
			System.out.println("acc no =" + a.getAccountNo() + "bal="
					+ a.getBalance() + "acc holdername=" + a.getName());
		}
		session.close();
	}
}
