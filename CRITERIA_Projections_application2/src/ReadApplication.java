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
			ProjectionList proList = Projections.projectionList();
			Projection proCount = Projections.count("accountNo");
			proList.add(proCount);
			creteria.setProjection(proList);

			Integer counts = (Integer) creteria.uniqueResult();
			System.out.println("The no. of Accounts=" + counts);

		} finally {
			session.close();
		}
	}
}
