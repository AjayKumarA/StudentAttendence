package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.Admins;

public class AdminDAO {
	public void addAdmin(Admins admins) throws SQLException
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql = "insert into admins(admin_id,admin_name,admin_phoneno,student_name,attendence_status,dates) values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, admins.getAdminId());
		preparedStatement.setString(2, admins.getAdminName());
		preparedStatement.setLong(3, admins.getAdminPhoneno());
		preparedStatement.setString(4, admins.getStudentName());
		preparedStatement.setString(5, admins.getAttendenceStatus());
		preparedStatement.setDate(6, Date.valueOf(admins.getDates()));
		preparedStatement.executeQuery();
		
	}

}
