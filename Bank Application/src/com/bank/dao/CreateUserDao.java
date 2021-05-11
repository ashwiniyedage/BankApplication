package com.bank.dao;

import java.sql.*;

import com.bank.model.CreateUser;

public class CreateUserDao 
{
	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String uname="system";
	String pass="ashwini";
	int i;
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public void myConnection() throws Exception
	{
		Class.forName(driver);
		con=DriverManager.getConnection(url,uname,pass);
		System.out.println("Connected : "+con);
	}
	public int create(CreateUser cu) throws Exception
	{
		myConnection();
		ps=con.prepareStatement("insert into userRegi values(?,?,?,?)");
		ps.setString(1, cu.getU_name());
		ps.setString(2, cu.getU_email());
		ps.setInt(3, cu.getU_acno());
		ps.setInt(4, cu.getU_bal());
		i=ps.executeUpdate();
		return i;
	}
}
