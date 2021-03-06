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
			Criterion criterion = Restrictions.lt("balance", 8000f);
			creteria.add(criterion);
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
