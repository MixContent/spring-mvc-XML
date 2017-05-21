package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.cms.model.StudentModel;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;
	private final String SQL_QRY_FOR_INSERT_STUDENT_INFO = "INSERT INTO STUDENT_INFO VALUES(?,?,?,?)";

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveStudent(StudentModel studentModel) {
		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_QRY_FOR_INSERT_STUDENT_INFO);
				ps.setString(1, studentModel.getSname());
				ps.setString(2, studentModel.getScollege());
				ps.setString(3, studentModel.getSphone());
				ps.setString(4, studentModel.getSemail());
				return ps;
			}
		});

	}

}
