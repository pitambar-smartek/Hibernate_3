import java.io.Serializable;

import org.hibernate.Session;

import com.pitambar.dao.Employee;
import com.pitambar.dao.HourlyEmployee;
import com.pitambar.dao.SalariedEmployee;
import com.pitambar.dao.SessionUtil;

public class TablePerHierarchyApplication
{
	public static void main(String args[])
	{
		Session session=SessionUtil.getSession();
		Employee e1=new Employee();
		//e1.setEmpno(1);
		e1.setName("Rahim");
	
		SalariedEmployee e2=new SalariedEmployee();
		e2.setName("Rama");
		e2.setSalary(6700);
		HourlyEmployee e3=new HourlyEmployee();
		e3.setName("Satish");
		e3.setWorkedHours(200);
		e3.setCostPerHour(40);
		session.getTransaction().begin();
	      session.save(e1);
		System.out.println("employee persisted ");
		session.save(e2);
		System.out.println("employee persisted with id:");
		session.save(e3);
		System.out.println("employee persisted with id:");

		session.getTransaction().commit();
		session.close();
	}
}