import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ListMethodsApplication {
	public static void main(String[] args) {
		String hql = "select a from Account a";

		String hql1 = "select a.name from Account a";

		String hql2 = "select a.balance from Account a";

		String hql3 = "select a.name,a.balance from Account a";

		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);

		List<Account> acc = query.list();
		System.out.println("Account Details...");
		for (Account a : acc) {
			System.out.println("acc no =" + a.getAccountNo() + "bal="
					+ a.getBalance() + "acc holdername=" + a.getName());
		}
		System.out.println("Account Holders details....");
		query = session.createQuery(hql1);
		List<String> names = query.list();
		for (String name : names) {
			System.out.println("The Account holders name=" + name);
		}
		System.out.println("Account Holders  Balance details....");
		query = session.createQuery(hql2);
		List<Float> bals = query.list();
		for (Float bal : bals) {
			System.out.println("The Balance=" + bal);
		}

		System.out.println("Account Holders Name and  Balance details....");
		query = session.createQuery(hql3);
		List<Object[]> arr = query.list();
		for (Object ob[] : arr) {
			for (Object o : ob) {
				System.out.print(o + "\t");
			}
			System.out.println();

		}
		session.close();
	}
}
