package com.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dao.AccountsDao;
import com.bank.model.CreateUser;
import com.bank.model.TransferMoney;

@WebServlet("/AccountsServlet")
public class AccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    public AccountsServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		AccountsDao ad=new AccountsDao();
		try {
			List<CreateUser> lst=ad.display();
			pw.print("<html><head><title>Transaction History</title>");
			pw.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css'></head>");
			pw.print("<body><h1 class='text-center text-capitalize font-italic'>Customer Accounts</h1>");
			pw.print("<table class='table table-striped table-bordered table-primary table-hover'><th>User Name</th><th>Mail ID</th><th>Account Number</th><th>Balance</th>");
			for(CreateUser cu:lst)
			{
				pw.print("<tr><td>"+cu.getU_name()+"</td><td>"+cu.getU_email()+"</td><td>"+cu.getU_acno()+"</td><td>"+cu.getU_bal()+"</td></tr>");
			}
			pw.print("</table><a href='index.jsp'>Back</a></body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
