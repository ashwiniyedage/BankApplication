package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bank.model.CreateUser;

public class AccountsDao 
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
	public List<CreateUser> display() throws Exception
	{
		myConnection();
		List<CreateUser> lst=new LinkedList<CreateUser>();
		String qry="select * from userRegi";
		Statement st=con.createStatement();
		rs=st.executeQuery(qry);
		
		while(rs.next())
		{
			CreateUser cu=new CreateUser();
			cu.setU_name(rs.getString(1));
			cu.setU_email(rs.getString(2));
			cu.setU_acno(rs.getInt(3));
			cu.setU_bal(rs.getInt(4));
			lst.add(cu);
		}
		return lst;
		
	}
}
