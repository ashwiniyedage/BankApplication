package com.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dao.HistoryDao;
import com.bank.dao.TransferMoneyDao;
import com.bank.model.TransferMoney;

/**
 * Servlet implementation class HistoryServlet
 */
@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		HistoryDao hd=new HistoryDao();
		try {
			
			List<TransferMoney> lst=hd.show();
			pw.print("<html><head><title>Transaction History</title>");
			pw.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css'></head>");
			pw.print("<body><h1 class='text-center text-capitalize font-italic'>Transaction Details</h1>");
			pw.print("<table class='table table-striped table-bordered'><th>Sender Name</th><th>Receiver Name</th><th>Amount</th>");
			for(TransferMoney tm:lst)
			{
				pw.print("<tr><td>"+tm.getS_name()+"</td><td>"+tm.getR_name()+"</td><td>"+tm.getAmount()+"</td></tr>");
			}
			pw.print("</table><a href='index.jsp'>Back</a></body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
