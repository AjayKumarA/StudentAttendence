package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.AdminRegister;

public class RegisterDAO {
	
	  public void addAdmins(AdminRegister adminregister) throws SQLException
	  {
	  Connection connection = ConnectionUtil.getConnection();
	  String sql = "Insert into adminregister(id,name,password,dob,email,phoneno)values(?,?,?,?,?,?)";
	  PreparedStatement preparedStatement = connection.prepareStatement(sql);
	  preparedStatement.setInt(1, adminregister.getId());
	  preparedStatement.setString(2, adminregister.getName());
	  preparedStatement.setString(3, adminregister.getPassword());
	  preparedStatement.setDate(4, Date.valueOf(adminregister.getDob()));
	  preparedStatement.setString(5, adminregister.getEmail());
	  preparedStatement.setLong(6, adminregister.getPhoneno());
	  
	  
	  int row=preparedStatement.executeUpdate();
	  System.out.println("rows affected: "+ row);
	  }
}
