import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.DAOFactory;
public class AccountStoringServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		//int ano=Integer.parseInt(req.getParameter("accno"));
		String nm=req.getParameter("name");
		float balance=Float.parseFloat(req.getParameter("balance"));
		
		AccountDAO dao=DAOFactory.getAccountDAO();

		Account acc=new Account();
		acc.setAccountNo(req.getParameter("accno").trim());
		acc.setName(nm);
		acc.setBalance(balance);
		
		  dao.storeAccount(acc);
		
		res.sendRedirect("account.html");
	}
}