package com.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.dao.CreateUserDao;
import com.bank.model.CreateUser;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/CreateUserServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserServlet() {
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
		String u_name=request.getParameter("uname");
		String u_email=request.getParameter("email");
		int u_ano=Integer.parseInt(request.getParameter("ano"));
		int u_bal=Integer.parseInt(request.getParameter("bal"));
		
		CreateUser cu=new CreateUser();
		cu.setU_name(u_name);
		cu.setU_email(u_email);
		cu.setU_acno(u_ano);
		cu.setU_bal(u_bal);
		
		CreateUserDao cud=new CreateUserDao();
		try {
			int i=cud.create(cu);
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
