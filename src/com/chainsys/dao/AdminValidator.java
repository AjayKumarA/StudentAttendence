package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.AdminRegister;

public class AdminValidator {
	public Boolean adminCheck(AdminRegister adminRegister) {
		Boolean isFound = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select id,password from adminregister where id = ? and password = ?";

			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			// Integer id = adminRegister.getId();
			preparedStatement.setInt(1, adminRegister.getId());
			//String password = adminRegister.getPassword();
			preparedStatement.setString(2, adminRegister.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				isFound = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isFound;
	}
}