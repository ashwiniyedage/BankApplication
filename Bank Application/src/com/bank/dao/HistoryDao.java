package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bank.model.TransferMoney;

public class HistoryDao 
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
	public List<TransferMoney> show() throws Exception
	{
		myConnection();
		List<TransferMoney> lst=new LinkedList<TransferMoney>();
		String qry="select sender_name,receiver_name,amount from trans";
		Statement st=con.createStatement();
		rs=st.executeQuery(qry);
		
		while(rs.next())
		{
			TransferMoney tm=new TransferMoney();
			tm.setS_name(rs.getString(1));
			tm.setR_name(rs.getString(2));
			tm.setAmount(rs.getInt(3));
			lst.add(tm);
		}
		return lst;
		
	}
}
