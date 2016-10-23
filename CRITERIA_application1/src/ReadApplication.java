import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) {
		Session session = null;
		try {
			session = SessionUtil.getSession();
			Criteria creteria = session.createCriteria(Account.class);
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
