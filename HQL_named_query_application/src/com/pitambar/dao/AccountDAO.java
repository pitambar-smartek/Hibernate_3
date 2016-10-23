package com.pitambar.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class AccountDAO {
	public List<Account> findAccounts() {
		Session session = SessionUtil.getSession();
		Query query = session.getNamedQuery("accounts");
		List<Account> accounts = query.list();
		session.close();
		return accounts;
	}
}