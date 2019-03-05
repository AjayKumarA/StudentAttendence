package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.Students;



public class ForgotDAO {
 
	public void changePassword(Students students) throws SQLException
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql = "update students set phoneno = ? ,password = ? where phoneno = ?";
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		Long phone = students.getPhoneno();
		preparedstatement.setLong(1,phone);
		preparedstatement.setString(2,students.getPassword());
		preparedstatement.setLong(3,phone);
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);

	}

	}


