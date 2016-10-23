import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) {
		Session session = null;
		try {
			session = SessionUtil.getSession();
			Criteria creteria = session.createCriteria(Account.class);
			ProjectionList projectionList = Projections.projectionList();

			Projection projection1 = Projections.max("balance");

			projectionList.add(projection1);

			creteria.setProjection(projectionList);

			float maxbalance = (Float) creteria.uniqueResult();
			System.out.println("The max result of account table=" + maxbalance);
		} finally {
			session.close();
		}
	}
}
