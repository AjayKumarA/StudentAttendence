package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chainsys.model.Admins;

public class HomeDAO {
	public ArrayList<Admins> findbyName(Admins admins) throws SQLException {

		Connection connection = ConnectionUtil.getConnection();
		String sql = "select student_name,dates,attendence_status from admins where student_name=? and dates=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, admins.getStudentName());
		preparedStatement.setDate(2, Date.valueOf(admins.getDates()));
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Admins> adminlist = new ArrayList<>();
		Admins admins1 = null;
		while (resultSet.next()) {
			admins1 = new Admins();
			admins1.setStudentName(resultSet.getString("student_name"));
			Date d = resultSet.getDate("dates");
			LocalDate ld = d.toLocalDate();
			admins1.setDates(ld);
			admins1.setAttendenceStatus(resultSet
					.getString("attendence_status"));
			adminlist.add(admins1);

		}

		ConnectionUtil.close(connection, preparedStatement, resultSet);

		return adminlist;
	}
}
