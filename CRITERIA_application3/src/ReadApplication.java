import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) {
		Session session = SessionUtil.getSession();
		;
		Criteria criteria = session.createCriteria(Account.class);
		Criterion criterion1 = Restrictions.lt("balance", 8000f);
		Criterion criterion2 = Restrictions.gt("balance", 5000f);
		/*
		 * OR Criterion criterion=Restrictions.between("balance",7000f,8000f);
		 * criteria.add(criterion);
		 */
		criteria.add(criterion1);
		criteria.add(criterion2);
		List<Account> accounts = criteria.list();
		for (Account a : accounts) {
			System.out.println(a.getAccountNo() + "\t" + a.getName() + "\t"
					+ a.getBalance());
		}
		session.close();
	}
}
