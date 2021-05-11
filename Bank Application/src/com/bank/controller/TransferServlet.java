package com.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dao.TransferMoneyDao;
import com.bank.model.TransferMoney;


@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
    public TransferServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s_name=request.getParameter("snm");
		int s_ano=Integer.parseInt(request.getParameter("sano"));
		int amount=Integer.parseInt(request.getParameter("amt"));
		String r_name=request.getParameter("rnm");
		int r_ano=Integer.parseInt(request.getParameter("rano"));
		
		TransferMoney tm=new TransferMoney();
		tm.setS_name(s_name);
		tm.setS_ano(s_ano);
		tm.setAmount(amount);
		tm.setR_name(r_name);
		tm.setR_ano(r_ano);
		
		TransferMoneyDao tmd=new TransferMoneyDao();
		try {
			int i = tmd.transfer(tm);
			if(i>0)
			{
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
