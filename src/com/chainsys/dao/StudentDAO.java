package com.chainsys.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.Students;

public class StudentDAO {
	public void addStudents(Students students) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "Insert into students(id,name,roll_no,class,gender,address,phone_number,email,password) values(students_id_seq.NEXTVAL,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, students.getName());
		preparedStatement.setString(2, students.getRollno());
		preparedStatement.setString(3, students.getClas());
		preparedStatement.setString(4, students.getGender());
		preparedStatement.setString(5, students.getAddress());
		preparedStatement.setLong(6, students.getPhoneno());
		preparedStatement.setString(7, students.getEmail());
		preparedStatement.setString(8, students.getPassword());
		preparedStatement.executeUpdate();
		// System.out.println("rows affected: "+ row);
		ConnectionUtil.close(connection, preparedStatement, null);

	}
}
