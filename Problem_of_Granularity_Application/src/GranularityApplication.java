import org.hibernate.Session;

import com.pitambar.dao.Address;
import com.pitambar.dao.Employee;
import com.pitambar.dao.SessionUtil;

public class GranularityApplication {
	public static void main(String args[]) {
		Session session = SessionUtil.getSession();
		session.beginTransaction();

		Employee emp1 = new Employee();
		emp1.setDeptno(1);
		emp1.setEmpno(686);
		emp1.setName("pitambar");
		emp1.setSalary(41000);
		Address address = new Address();
		address.setCity("pune");
		address.setHno("B33");
		address.setPin(411027);
		address.setStreet("sangvi");
		emp1.setAddr(address);
		session.save(emp1);
		System.out.println("Employee one is saved properly");

		Employee emp2 = new Employee();
		emp2.setDeptno(20);
		emp2.setEmpno(1001);
		emp2.setName("Swati");
		emp2.setSalary(51000);
		Address addres = new Address();
		addres.setCity("Koregaon");
		addres.setHno("B475");
		addres.setPin(411030);
		addres.setStreet("Hadapsar");
		emp2.setAddr(addres);
		session.save(emp2);
		System.out.println("Employee two is saved properly");
		Employee acc = (Employee) session.get(Employee.class, 1001);
		session.beginTransaction().commit();

		System.out.println("Employee details");

		System.out.println("The employee no=" + acc.getEmpno());
		System.out.println("The dept no. is=" + acc.getDeptno());
		System.out.println("The salary is=" + acc.getSalary());
		System.out.println("The Name is=" + acc.getName());

		System.out.println("The homeno=" + acc.getAddr().getHno());
		System.out.println("The street is=" + acc.getAddr().getStreet());
		System.out.println("The city is=" + acc.getAddr().getCity());
		System.out.println("The pin no is=" + acc.getAddr().getPin());

		session.close();
	}

}