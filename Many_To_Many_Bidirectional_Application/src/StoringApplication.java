import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pitambar.dao.Course;
import com.pitambar.dao.SessionUtil;
import com.pitambar.dao.Student;


public class StoringApplication {

	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		Course course=new Course();
		course.setCname("finance");
		course.setCno(127);
		
		Course courseOne=new Course();
		courseOne.setCname("bba");
		courseOne.setCno(128);
		
		session.save(course);
		session.save(courseOne);
		
		Student student=new Student();
		student.setSname("OMM");
		student.setSno(140);
		
		Student studentOne=new Student();
		studentOne.setSname("OMM");
		studentOne.setSno(140);
		
		Student studentTwo=new Student();
		studentTwo.setSname("OMM");
		studentTwo.setSno(140);
		
		session.save(student);
		session.save(studentOne);
		session.save(studentTwo);
		
		student.getCourseList().add(course);
		student.getCourseList().add(courseOne);
		
		studentOne.getCourseList().add(course);
		studentOne.getCourseList().add(courseOne);
		studentTwo.getCourseList().add(course);
		studentTwo.getCourseList().add(courseOne);
		tx.commit();
		System.out.println("Record inserted successfully");
		
		

	}

}
