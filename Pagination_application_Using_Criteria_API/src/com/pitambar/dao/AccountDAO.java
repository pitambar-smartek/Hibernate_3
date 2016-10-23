package com.pitambar.dao;

import org.hibernate.Session;
import org.hibernate.Criteria;
import java.util.List;

public class AccountDAO {
	int pageSize = 3;

	public List<Account> getAccounts(int pageNumber) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Account.class);
		criteria.setFirstResult(pageSize * (pageNumber - 1));
		criteria.setMaxResults(pageSize);
		List<Account> accounts = criteria.list();
		session.close();
		return accounts;
	}
}
