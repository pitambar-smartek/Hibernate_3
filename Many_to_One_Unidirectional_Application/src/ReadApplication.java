import org.hibernate.classic.Session;

import com.pitambar.dao.Department;
import com.pitambar.dao.Employee;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {

	public static void main(String args[]) {
		Session session = (Session) SessionUtil.getSession();
		Employee emp=(Employee) session.get(Employee.class,101);
		
			System.out.println("EmpName::="+emp.getEname()+ " EmpId"+emp.getEid()+" Employee Salary=="+emp.getEsal());
			Department dept=emp.getDepartment();
			System.out.println("The Dept NO="+dept.getDeptno()+" The Location="+dept.getLocation()+" Department Name="+dept.getDeptname());
			
			
		
		session.close();
	}

}
