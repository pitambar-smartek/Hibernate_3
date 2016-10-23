
import java.util.Scanner;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.DAOFactory;
public class DepositUseCase 
{
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account no=");
		String ano=s.next();
		System.out.println("Enter the Amount to deposit=");
		int amount=s.nextInt();

		AccountDAO dao=DAOFactory.getAccountDAO();
		Account acc=dao.findAccount(ano);
		if(acc==null)
			System.out.println("Enter wrong account number entered");
		else{
			float balance=acc.getBalance();
			balance=balance+amount;
				acc.setBalance(balance);
				dao.updateAccount(acc);
				System.out.println("your money  is successfully deposited");
			}
		
	}
}
