package com.bac.awd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bac.awd.model.Graduate;
import com.bac.awd.repository.I_UserService;
import com.bac.awd.services.GraduateService_Imple;

/**
 * Servlet implementation class IndexControoler
 */
@WebServlet("/IndexControoler")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Graduate> graduates;
	I_UserService<Graduate> graduateService;
    /**
     * Default constructor. 
     */
    public IndexController() {
        // TODO Auto-generated constructor stub
    	graduateService = new GraduateService_Imple();
    	
    	graduates = graduateService.getAllUsers();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("graduates", graduates);
		
		response.sendRedirect("index.jsp");
	}

}
