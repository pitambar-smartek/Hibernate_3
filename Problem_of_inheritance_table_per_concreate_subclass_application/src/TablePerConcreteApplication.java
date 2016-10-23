import java.io.Serializable;

import org.hibernate.Session;

import com.pitambar.dao.HourlyEmployee;
import com.pitambar.dao.SalariedEmployee;
import com.pitambar.dao.SessionUtil;
public class TablePerConcreteApplication
{
	public static void main(String args[])
	{
		Session session=SessionUtil.getSession();
		SalariedEmployee e1=new SalariedEmployee();
		e1.setName("Rama");
		e1.setSal(6700);
		HourlyEmployee e2=new HourlyEmployee();
		e2.setName("satish");
		e2.setWorkedHours(200);
		e2.setCostPerHour(40);
		session.getTransaction().begin();
		Serializable id=session.save(e1);
		System.out.println("Employee persisted with id"+id);
		id=session.save(e2);
		System.out.println("Employee persisted with id"+id);
		session.getTransaction().commit();
		session.close();			
	}
}