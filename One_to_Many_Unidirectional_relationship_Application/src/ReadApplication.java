import org.hibernate.classic.Session;

import com.pitambar.dao.Department;
import com.pitambar.dao.Employee;
import com.pitambar.dao.SessionUtil;

public class ReadApplication {

	public static void main(String args[]) {
		Session session = (Session) SessionUtil.getSession();
		Department dept=(Department) session.get(Department.class, 20);
		System.out.println("The Dept NO="+dept.getDeptno()+" The Location="+dept.getLocation()+" Department Name="+dept.getDeptname());
		System.out.println("The No. of Employee in that department is==");
		for(Employee e:dept.getEmployeeList()){
			System.out.println("EmpName::="+e.getEname()+ " EmpId"+e.getEid()+" Employee Salary=="+e.getEsal());
		}
		session.close();
	}

}
