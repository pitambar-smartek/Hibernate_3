import org.hibernate.Session;

import com.pitambar.dao.Employee;
import com.pitambar.dao.HourlyEmployee;
import com.pitambar.dao.SalariedEmployee;
import com.pitambar.dao.SessionUtil;

public class ReadApplication
{
	public static void main(String args[])
	{
		Session session=SessionUtil.getSession();
		Employee e=(Employee)session.get(Employee.class,2);
		if(e instanceof HourlyEmployee)
		{
		    HourlyEmployee he=(HourlyEmployee)e;
			System.out.println("Hourly employee details....");
			System.out.println("EID"+he.getEmpno());
			System.out.println("Name"+he.getName());
			System.out.println("Worked hours:"+he.getWorkedHours());
			System.out.println("Rate per hour Rs.:"+he.getCostPerHour());
		}
		else if(e instanceof SalariedEmployee)
		{
			SalariedEmployee se=(SalariedEmployee)e;
			System.out.println("Salaried Employee details....");
			System.out.println("EID"+se.getEmpno());
			System.out.println("Name"+se.getName());
			System.out.println("Salary Rs:"+se.getSalary());
		}
		session.close();
	}
}