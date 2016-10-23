package com.pitambar.dao;
import java.sql.*;
import java.io.*;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.engine.SessionImplementor;
public class LoanIdGenerator implements IdentifierGenerator{
	String str = "LYHYD";
public Serializable generate(SessionImplementor session,Object o){
	try
	{
		Connection con = session.connection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select to_char(loan_sequence.nextval,'FM00000') from dual");
		rs.next();
		str = str+rs.getString(1);
		rs.close();
		st.close();
		con.close();
	}
	catch (Exception e)
	{
	}
	return str;

}

}