package com.chainsys.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.HomeDAO;
import com.chainsys.model.Admins;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name = request.getParameter("name");  
    	LocalDate date = LocalDate.parse(request.getParameter("dates"));
    	  
    	  try {
    	  Admins admins = new Admins();
    	  admins.setStudentName(name);
    	  admins.setDates(date);
    	  
    	  HomeDAO homedao = new HomeDAO();
    	
			List<Admins> studentList = homedao.findbyName(admins);
			request.setAttribute("STATUS",studentList);
			RequestDispatcher rd = request.getRequestDispatcher("Status.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
			}

}
