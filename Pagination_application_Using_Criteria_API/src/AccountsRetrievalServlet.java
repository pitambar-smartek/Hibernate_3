import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAO;

public class AccountsRetrievalServlet extends HttpServlet {
	AccountDAO dao = new AccountDAO();

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		int pageNumber = 1;
		if (req.getParameter("page") != null) {
			getServletContext().setAttribute("page", req.getParameter("page"));
			pageNumber = Integer.parseInt(req.getParameter("page"));
		} else {
			getServletContext().setAttribute("page", "1");
		}
		String nextPage = (pageNumber + 1) + "";
		List<Account> accounts = dao.getAccounts(pageNumber);
		getServletContext().setAttribute("accounts", accounts);
		String myUrl = "./accservlet?page=" + nextPage;
		req.setAttribute("myUrl", myUrl);
		req.setAttribute("n", accounts.size());
		req.getRequestDispatcher("results.jsp").forward(req, res);

	}
}