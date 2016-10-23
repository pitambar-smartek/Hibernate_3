
import java.util.Scanner;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.DAOFactory;
public class OpeningUseCase 
{
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter new Account no.=");
		String acno=s.next();
		s.nextLine();
		System.out.println("Enter Account holder's name=");
		String name=s.nextLine();
		System.out.println("Enter Account holder's balance");
			float balance=s.nextFloat();
		Account acc=new Account();
		acc.setAccountNo(acno);
		acc.setName(name);
		acc.setBalance(balance);		

		AccountDAO dao=DAOFactory.getAccountDAO();
		  dao.storeAccount(acc);
		System.out.println("your account is successfully opened");
		
	}
}
