package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.Admins;

public class AdminDAO {
	public void addAdmin(Admins admins) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "insert into admins(id,name,phone_number,student_name,attendence_status,dates) values(admins_id_seq.NEXTVAL,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, admins.getName());
		preparedStatement.setLong(2, admins.getPhonenumber());
		preparedStatement.setString(3, admins.getStudentName());
		preparedStatement.setString(4, admins.getAttendenceStatus());
		preparedStatement.setDate(5, Date.valueOf(admins.getDates()));
		preparedStatement.executeQuery();

	}

}
