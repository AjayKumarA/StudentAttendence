package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ForgotDAO;
import com.chainsys.dao.ForgotPasswordDAO;
import com.chainsys.model.AdminRegister;
import com.chainsys.model.Students;

/**
 * Servlet implementation class ForgetServlet
 */
@WebServlet("/ForgetServlet")
public class ForgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		      Long phoneno=Long.parseLong(request.getParameter("phonenumber"));
		      String password=request.getParameter("newpassword");
		      Students students = new Students();
		      students.setPhoneno(phoneno);
		      students.setPassword(password);
		      System.out.println(students.getPhoneno());
		      System.out.println(students.getPassword());
		      ForgotDAO forgotDAO=new ForgotDAO();
		      //PasswordValidator passwordvalidator=new PasswordValidator();
		      
		      try{
		      forgotDAO.changePassword(students);

		      RequestDispatcher req = request.getRequestDispatcher("success.html");
		      req.forward(request, response);
		      }
		      catch(Exception e)
		      {
		    	  e.printStackTrace();
		      



		      }

		      }
	}

