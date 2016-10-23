import java.util.List;

import org.hibernate.Session;

import com.pitambar.dao.Course;
import com.pitambar.dao.SessionUtil;
import com.pitambar.dao.Student;
public class  ReadApplication
{
	public static void main(String args[])
	{
		Session session=SessionUtil.getSession();
		Student s1=(Student)session.get(Student.class,101);
		System.out.println("The student details.....");
		System.out.println("The Student ID="+s1.getSno());
		System.out.println("The student name"+s1.getSname()+"\n");
		System.out.println("The student has registered for the following courses ....");
		List<Course> courses=s1.getCourseList();
		for(Course c:courses)
		{
			System.out.println("Course ID"+c.getCno());
			System.out.println("Course Name"+c.getCname());
		}
		Course c=(Course)session.get(Course.class,2002);
		System.out.println("The course details.....");
		System.out.println("Course ID"+c.getCno());
		System.out.println("Course Name"+c.getCname());
		System.out.println("The following student registered for this course");
		List<Student> students=c.getStudentList();
		for(Student s:students)
		{
			System.out.println("The Student ID"+s.getSno());
			System.out.println("The Student Name"+s.getSname());
		}
		session.close();
	}
}