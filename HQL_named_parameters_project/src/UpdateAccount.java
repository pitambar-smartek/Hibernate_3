import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class UpdateAccount {
	public static void main(String[] args) {
		String hql = "update   Account a   set a.balance=a.balance + :amt where a.balance>:range";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter("amt", 500f);
		query.setParameter("range", 8900f);
		session.getTransaction().begin();
		int c = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("The no. of account is updated is:= " + c);
		session.close();
	}
}
