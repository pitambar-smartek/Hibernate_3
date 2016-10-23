import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.pitambar.dao.Department;
import com.pitambar.dao.Employee;
import com.pitambar.dao.SessionUtil;

public class StoreApplication {
	public static void main(String args[]) {
		Session session = SessionUtil.getSession();
		Employee emp1 = new Employee();
		emp1.setEid(104);
		emp1.setEname("Samaya");
		emp1.setEsal(95000);

		Employee emp2 = new Employee();
		emp2.setEid(105);
		emp2.setEname("Prabhat");
		emp2.setEsal(45000);

		Employee emp3 = new Employee();
		emp3.setEid(106);
		emp3.setEname("Animesh");
		emp3.setEsal(120000);

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);

		Department de = new Department();
		de.setDeptno(20);
		de.setDeptname("EC");
		de.setLocation("Mumbai");
		de.setEmployeeList(emps);

		session.getTransaction().begin();
		Serializable id = session.save(de);
		session.getTransaction().commit();
		System.out.println("Department is saved with id" + id);
		session.close();
	}

}
