package com.sapient.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;

import javax.servlet.http.HttpSession;



import com.sapient.model.LoginModel;
import com.sapient.userform.LoginForm;

public class LoginAction extends Action {
	


	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) {
		
		LoginModel siLoginModel = new LoginModel();
		ActionForward forward = null;
		LoginForm siLoginForm = (LoginForm) form;

		String user = siLoginForm.getSiUserName();
		String password = siLoginForm.getSiPassword();
		HttpSession session = req.getSession();

		try {

			String result = siLoginModel.isAutenticated(user, password);

			if (result.equalsIgnoreCase("user")) {

				session.setAttribute("user", user);
				session.setAttribute("role", result);
				
				forward = mapping.findForward("success");
			} else {

				session.setAttribute("user", user);
				session.setAttribute("role", result);
				
				forward = mapping.findForward("manager");
			} 
			

		} catch (Exception e) {
			
			forward = mapping.findForward("failure");
		}
	

		return forward;

	}
}