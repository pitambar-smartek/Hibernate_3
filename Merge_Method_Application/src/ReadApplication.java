import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;
public class ReadApplication 
{
	public static void main(String[] args) 
	{		
		Session session=SessionUtil.getSession();
		Account acc=(Account)session.get(Account.class,8);
		System.out.println(acc.getBalance());
		System.out.println(acc.getName());
      

		Account acc1=new Account();
		acc1.setAccno(8);
		acc1.setName("Samaya");
		acc1.setBalance(13750f);
        session.getTransaction().begin();
		session.merge(acc1);
		session.getTransaction().commit();//it generate update statement and all the properties of other object is copy to persistent class

		System.out.println(acc.getBalance());
		System.out.println(acc.getName());
		
		Account acc2=new Account();		
		acc2.setAccno(106);
		acc2.setName("Radha");
		acc2.setBalance(13250f);
		
		Transaction tx=session.beginTransaction();
		session.merge(acc2);//it generate insert statement insert the above record into database
	    tx.commit();
		
		System.out.println("It  generate insert statement");
		
		session.close();		
	}
}
