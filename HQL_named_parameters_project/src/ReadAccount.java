import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadAccount {
	public static void main(String[] args) {
		String hql = "select a from Account a where a.accountNo=:ano or a.accountNo=:ano1";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter("ano", "ACC110");
		query.setParameter("ano1", "ACC102");

		List<Account> acc = query.list();
		for (Account a : acc) {
			System.out.println("acc no =" + a.getAccountNo() + "bal="
					+ a.getBalance() + "acc holdername=" + a.getName());
		}
		session.close();
	}
}
