package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.RegisterDAO;
import com.chainsys.model.AdminRegister;


@WebServlet("/AdminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		String email = request.getParameter("email");
		Long phoneno = Long.parseLong(request.getParameter("phoneno"));
		
		AdminRegister adminRegister = new AdminRegister();
		adminRegister.setId(id);
		adminRegister.setName(name);
		adminRegister.setPassword(password);
		adminRegister.setDob(dob);
		adminRegister.setEmail(email);
		adminRegister.setPhoneno(phoneno);
	
		RegisterDAO registerDAO = new RegisterDAO();
		try {
			registerDAO.addAdmins(adminRegister);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
