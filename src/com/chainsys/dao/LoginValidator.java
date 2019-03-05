package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.Students;

public class LoginValidator {
       public Boolean checkLogin(Students students)
       {
    	   Boolean isFound=false;
    	   try {
    	   Connection connection=ConnectionUtil.getConnection();
    	   String sql="select phoneno,password from students where phoneno=? and password=?";
    	   
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			Long phoneno=students.getPhoneno();
			preparedStatement.setLong(1,phoneno);
			preparedStatement.setString(2, students.getPassword());
			ResultSet rset=preparedStatement.executeQuery();
			while(rset.next())
			{
				isFound=true;
				break;
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
       return isFound;
}
       
}
