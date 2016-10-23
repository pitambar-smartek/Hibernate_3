import java.sql.CallableStatement;
import java.sql.Connection;
import org.hibernate.Session;
import com.pitambar.dao.SessionUtil;

public class StoredProcedureApplication {
	public static void main(String args[]) throws Exception {
		Session session = SessionUtil.getSession();

		Connection con = session.connection();

		CallableStatement cst = con.prepareCall("{call changebal(?,?)}");
		cst.setString(1, "ACC101");
		cst.setFloat(2, 5900f);

		session.getTransaction().begin();
		cst.execute();
		session.getTransaction().commit();

		System.out.println("Account is updated");
		cst.close();
		session.close();

	}
}
