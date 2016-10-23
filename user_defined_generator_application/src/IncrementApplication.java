import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pitambar.dao.Loan;
import com.pitambar.dao.SessionUtil;
class IncrementApplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a/c holder name. :");
		String nm = sc.next();
		System.out.print("Enter a/c balance. :");
		float bal = sc.nextFloat();
		Loan acc = new Loan();
		acc.setName(nm);
		acc.setLamount(bal);
		Session session = SessionUtil.getSession();
		Transaction txn = session.beginTransaction();
		session.save(acc);
		txn.commit();
		System.out.println("Account stored successfully");
	session.close();
 }
}