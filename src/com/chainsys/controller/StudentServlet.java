package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.StudnetDAO;
import com.chainsys.model.Students;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String rollno = request.getParameter("number");
		String clas = request.getParameter("clas");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		Long phoneno = Long.parseLong(request.getParameter("phoneno"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Students students = new Students();
		students.setName(name);
		students.setRollno(rollno);
		students.setClas(clas);
		students.setGender(gender);
		students.setAddress(address);
		students.setPhoneno(phoneno);
		students.setEmail(email);
		students.setPassword(password);
		
		StudnetDAO studentDAO = new StudnetDAO();
		try {
			studentDAO.addStudents(students);
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
