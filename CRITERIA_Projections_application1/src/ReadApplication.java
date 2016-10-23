import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {
	public static void main(String args[]) {
		Session session = null;
		try {
			session = SessionUtil.getSession();

			Criteria creteria = session.createCriteria(Account.class);
			ProjectionList proList = Projections.projectionList();
			Projection projectionName = Projections.property("name");
			Projection projectionBalance = Projections.property("balance");
			proList.add(projectionName);
			proList.add(projectionBalance);
			creteria.setProjection(proList);
			List<Object[]> objects = creteria.list();
			for (Object os[] : objects) {
				for (Object o : os) {
					System.out.println(o + "\t");
				}
			}
		} finally {
			session.close();
		}
	}
}
