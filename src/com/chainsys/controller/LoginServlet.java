package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.LoginValidator;
import com.chainsys.model.Students;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long phoneno = Long.parseLong(request.getParameter("phoneno"));
		String password = request.getParameter("password");

		Students students = new Students();
		students.setPhoneno(phoneno);
		students.setPassword(password);
		LoginValidator loginValidator = new LoginValidator();
		if (loginValidator.checkLogin(students)) {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("students.html");
			rd.forward(request, response);
		}
	}
}
