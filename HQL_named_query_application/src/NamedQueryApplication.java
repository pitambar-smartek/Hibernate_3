import java.util.List;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAO;

public class NamedQueryApplication {
	public static void main(String[] args) {

		AccountDAO acc = new AccountDAO();
		List<Account> accounts = acc.findAccounts();
		System.out.println("Account Details...");
		for (Account a : accounts) {
			System.out.println("acc no =" + a.getAccountNo() + "bal="
					+ a.getBalance() + "acc holdername=" + a.getName());
		}

	}
}
