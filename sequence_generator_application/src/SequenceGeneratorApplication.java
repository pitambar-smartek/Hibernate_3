import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pitambar.dao.Account;
import com.pitambar.dao.SessionUtil;

class SequenceGeneratorApplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		/*
		 * create sequence myaccount_sequence start with 3001 increment by 1
		 * nocache nocycle
		 */// This sequence is created in database
		System.out.print("Enter a/c holder name. :");
		String nm = sc.next();
		System.out.print("Enter a/c balance. :");
		float bal = sc.nextFloat();
		Account acc = new Account();
		acc.setName(nm);
		acc.setBalance(bal);
		Session session = SessionUtil.getSession();
		Transaction txn = session.beginTransaction();
		session.save(acc);
		txn.commit();
		System.out.println("Account stored successfully");
		session.close();
	}
}