package com.pitambar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApplication {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factroy = config.buildSessionFactory();
		Session session = factroy.openSession();
		System.out.println(session);
		String acccountNo = "ACC101";
		Account acc = (Account) session.get(Account.class, acccountNo);

		System.out.println(acc);
		if (acc == null) {
			System.out.println("Account does not exists");
		} else {
			System.out.println("Accountno=" + acc.getAccountNo()
					+ "Account holder Name=" + acc.getName() + " Balance="
					+ acc.getBalance());

		}

	}

}
