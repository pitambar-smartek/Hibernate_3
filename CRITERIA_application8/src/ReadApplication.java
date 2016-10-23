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
			Criterion criterion1 = Restrictions.gt("accountNo", "ACC101");
			Criterion criterion2 = Restrictions.like("name", "%a%");
			Criterion criterion3 = Restrictions.and(criterion1, criterion2);

			creteria.add(criterion3);
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
