import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pitambar.dao.SessionUtil;

public class NamedQueryApplication {
	public static void main(String args[]) {

		Session session = SessionUtil.getSession();
		Query query = session.getNamedQuery("avgsal");
		List<Float> sal = query.list();
		System.out.println("The average salary is=" + sal + "\n");
		query = session.getNamedQuery("groupsal");
		List<Object[]> objs = query.list();
		System.out.println("Dept no. group by salary....");
		for (Object[] o : objs) {
			System.out.println(o[0] + "\t" + o[1]);
		}
		System.out.println("\n");
		query = session.getNamedQuery("ordersal");
		objs = query.list();
		System.out
				.println("Order by employee according to salary desending order");
		for (Object[] o : objs) {
			System.out.println(o[0] + "\t" + o[1]);

		}
		session.close();

	}

}