import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) {
		Session session = null;
		try {
			session = SessionUtil.getSession();
			Criteria creteria = session.createCriteria(Account.class);
			Criterion criterion1 = Restrictions.eq("name", "Swati");
			Criterion criterion2 = Restrictions.eq("balance", 5841f);

			/*
			 * OR Account
			 * acc=(Account)session.createCriteria(Account.class)add(Restrictions
			 * .eq("name","Naresh")).add(Restrictions.eq("balance",13750f)).
			 * uniqueResult();
			 */

			creteria.add(criterion1);
			creteria.add(criterion2);
			List<Account> acc = creteria.list();
			for (Account ac : acc) {
				System.out.println("Account No=" + ac.getAccountNo() + "name="
						+ ac.getName() + " Balance=" + ac.getBalance());
			}
		} finally {
			session.close();
		}
	}
}
