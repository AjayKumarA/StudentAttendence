package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.AdminRegister;

public class ForgotPasswordDAO {
     
	public void updatePassword(AdminRegister adminRegister) throws SQLException
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql="update adminregister set phoneno = ? ,password = ? where phoneno=?";
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		Long phone=adminRegister.getPhoneno();
		preparedstatement.setLong(1,phone);
		preparedstatement.setString(2,adminRegister.getPassword());
		preparedstatement.setLong(3,phone);
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);

	}

	}

