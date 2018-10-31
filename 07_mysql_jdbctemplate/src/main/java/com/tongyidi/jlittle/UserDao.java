package com.tongyidi.jlittle;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 增删改都是update
	 * @param user
	 */
	public void addUser(User user) {

		String sql = "insert into user (name, age,salary) values (?,?,?)";

		jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getSalary());
	}
	public List<User> query(){
		String sql = "select id,name,age,salary from user";
		List<User> list =  jdbcTemplate.query(sql, new UserMapper());
		return list;
	}


}
