package com.bank.dao;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import com.bank.model.TransferMoney;
public class TransferMoneyDao 
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
	public int transfer(TransferMoney tm) throws Exception
	{
		myConnection();
		ps=con.prepareStatement("insert into trans values(?,?,?,?,?)");
		ps.setString(1, tm.getS_name());
		ps.setInt(2, tm.getS_ano());
		ps.setInt(3, tm.getAmount());
		ps.setString(4, tm.getR_name());
		ps.setInt(5, tm.getR_ano());
		i=ps.executeUpdate();
				
		String qry="update userRegi set user_bal=user_bal-'"+tm.getAmount()+"' where account_no='"+tm.getS_ano()+"'";
		
		String qry1="update userRegi set user_bal=user_bal+'"+tm.getAmount()+"' where account_no='"+tm.getR_ano()+"'";
		ps  = con.prepareStatement(qry);
		int j=ps.executeUpdate();
		ps  = con.prepareStatement(qry1);
		int k= ps.executeUpdate();
		if(i<1 && j<1 && k<1)
		{
			while(rs.next())
			{
				i=1;
			}
		}
		return i;
	}
	
}
