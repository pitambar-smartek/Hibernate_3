import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class TestClient
{
    public static void main(String args[])
    {
    //Activate Hibernate Software
    	Configuration cfg=new Configuration();
    	cfg.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
    	cfg.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
    	cfg.setProperty("hibernate.connection.username","system");
    	cfg.setProperty("hibernate.connection.password","pita1234#");
    	cfg.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
    	cfg.addFile("C:\\Users\\Admin\\hibernateApplication\\No_configuration_file_Hibernate_application\\src\\employee.hbm.xml");
    	
    //create SessionFactory obj
    SessionFactory factory=cfg.buildSessionFactory();
    //create HB session obj
    Session ses=factory.openSession();
    //write o-r mapping persistence logic
    //create object for HB POJO class with data
    Employee eb=(Employee)ses.get(Employee.class,101);
	System.out.println(eb.getEid()+" "+eb.getFname()+" "+eb.getLname()+" "+eb.getEmail());
	try
	{
	Thread.sleep(2000);
	}
	catch(InterruptedException ie)
	{
	System.err.println("hello");
	}
	ses.refresh(eb);
	System.out.println(eb.getEid()+" "+eb.getFname()+" "+eb.getLname()+" "+eb.getEmail());
	
    ses.close();
    factory.close();
    
    }
}
