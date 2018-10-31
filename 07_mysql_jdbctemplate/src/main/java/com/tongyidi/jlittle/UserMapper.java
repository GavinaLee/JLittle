package com.tongyidi.jlittle;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet arg0, int arg1) throws SQLException {
		User user = new User();
		user.setId(arg0.getInt(1));
		user.setName(arg0.getString(2));
		user.setAge(arg0.getInt(3));
		user.setSalary(arg0.getBigDecimal(4));
		return user;
	}

}
