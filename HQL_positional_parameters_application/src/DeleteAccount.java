import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class DeleteAccount {
	public static void main(String[] args) {
		String hql = "delete  from  Account a   where a.balance>=?";
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, 5200f);
		session.getTransaction().begin();
		int c = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("The no. of account is deleted is:= " + c);
		session.close();
	}
}
