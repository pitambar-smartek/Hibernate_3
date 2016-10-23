package com.sapient.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sapient.util.DBUtil;

public class LoginModel {

	public String isAutenticated(String user, String pwd) throws Exception {

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet resultSet = null;
		String role = "";

		try {

			con = DBUtil.getConnection();

			pst = con
					.prepareStatement("select role from user_login where user_name=? and password=?");

			pst.setString(1, user);
			pst.setString(2, pwd);
			resultSet = pst.executeQuery();
			if (resultSet.next()) {
				role = resultSet.getString(1);
			}
		} catch (Exception ex) {

			throw ex;
		} finally {
			DBUtil.closeConnection(con, pst, resultSet);

		}
		return role;
	}
}
