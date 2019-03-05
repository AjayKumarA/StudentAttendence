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

import com.chainsys.dao.AdminDAO;
import com.chainsys.model.Admins;

/**
 * Servlet implementation class AdminPageServlet
 */
@WebServlet("/AdminPageServlet")
public class AdminPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminID = Integer.parseInt(request.getParameter("adminId"));
		String adminName = request.getParameter("adminName");
		Long adminPhoneno = Long.parseLong(request.getParameter("adminPhoneno"));
		String studentName = request.getParameter("studentName");
		String attendenceStatus = request.getParameter("attendenceStatus");
		LocalDate dates = LocalDate.parse(request.getParameter("dates"));
		
		Admins admins = new Admins();
		admins.setAdminId(adminID);
		admins.setAdminName(adminName);
		admins.setAdminPhoneno(adminPhoneno);
		admins.setStudentName(studentName);
		admins.setAttendenceStatus(attendenceStatus);
		admins.setDates(dates);
		
		AdminDAO admindao = new AdminDAO();
		try {
			admindao.addAdmin(admins);
			RequestDispatcher rd = request.getRequestDispatcher("Register.html");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
