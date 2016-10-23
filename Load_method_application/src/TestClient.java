import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestClient {
	public static void main(String args[]) {
		// Activate Hibernate Software
		Configuration c=new  Configuration();
		c.configure();
		
		// create SessionFactory obj
		SessionFactory factory = c.buildSessionFactory();
		// create HB session obj
		Session ses = factory.openSession();
		// write o-r mapping persistence logic
		// create object for HB POJO class with data
		Employee eb = (Employee) ses.load(Employee.class, 101);
		System.out.println(eb.getEid() + " " + eb.getFname() + " "
				+ eb.getLname() + " " + eb.getEmail());
		ses.close();
		factory.close();

	}
}
