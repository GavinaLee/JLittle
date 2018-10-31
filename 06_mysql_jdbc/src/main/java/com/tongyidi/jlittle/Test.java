package com.tongyidi.jlittle;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		JDBCTest jdbcTest = new JDBCTest();

		User user = new User();
		user.setAge(35);
		user.setName("莉莉12222");
		user.setSalary(new BigDecimal("63366.335"));
		jdbcTest.insert(user);
		jdbcTest.getAll();
	
	}
}
