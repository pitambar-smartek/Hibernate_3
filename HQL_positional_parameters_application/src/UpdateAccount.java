import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class UpdateAccount {
	public static void main(String[] args) {
		String hql = "update   Account a   set a.balance=a.balance + ? where a.balance>?";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, 500f);
		query.setParameter(1, 89f);
		session.getTransaction().begin();
		int c = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("The no. of account is updated is:= " + c);
		session.close();
	}
}
