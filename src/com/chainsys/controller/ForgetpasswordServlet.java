package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ForgotPasswordDAO;
import com.chainsys.model.AdminRegister;


	      @WebServlet("/ForgetpasswordServlet")
	      public class ForgetpasswordServlet extends HttpServlet {
	      private static final long serialVersionUID = 1L;
	         
	      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      Long phone=Long.parseLong(request.getParameter("phone"));
	      String password=request.getParameter("newpassword");
	      AdminRegister adminregister=new AdminRegister();
	      adminregister.setPhoneno(phone);
	      adminregister.setPassword(password);
	      System.out.println(adminregister.getPhoneno());
	      System.out.println(adminregister.getPassword());
	      ForgotPasswordDAO forgotPasswordDAO=new ForgotPasswordDAO();
	     
	      
	      try{
	      forgotPasswordDAO.updatePassword(adminregister);

	      RequestDispatcher req = request.getRequestDispatcher("passwordsuccess.html");
	      req.forward(request, response);
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }

	      }
	}

