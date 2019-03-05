package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.AdminValidator;
import com.chainsys.model.AdminRegister;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Integer id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		AdminRegister adminRegister = new AdminRegister();
		adminRegister.setId(id);
		adminRegister.setPassword(password);
		
		/*  AdminValidator adminValidator = new AdminValidator();
		  
		  if(adminValidator.adminCheck(adminRegister))
		  {*/
		    RequestDispatcher rd = request.getRequestDispatcher("adminpage.jsp");
			rd.forward(request, response);
		/*  }
		  else
		  {
			RequestDispatcher rd = request.getRequestDispatcher("adminregister.jsp");
			rd.forward(request, response);
		  }*/
	}

}
