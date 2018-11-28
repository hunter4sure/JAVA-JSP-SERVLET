package com.bac.awd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bac.awd.model.Company;
import com.bac.awd.services.CompanyService_Imple;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("");
		String password = request.getParameter("");
		
		Company c = new Company();
		c.setEmail(email);
		c.setPassword(password);
		
		CompanyService_Imple cs = new CompanyService_Imple();
		boolean success = cs.Authenticate(c);
		
		if(success) 
		{
			response.sendRedirect("home.jsp");
		}else 
		{
			response.sendRedirect("error.jsp");
		}
	}

}
