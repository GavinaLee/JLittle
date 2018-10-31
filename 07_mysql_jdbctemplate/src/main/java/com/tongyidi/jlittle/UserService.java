package com.tongyidi.jlittle;

import java.util.List;

public class UserService {
	// 加入userDao作为成员变变量
	private UserDao userDao;

	// 注意这里要增加get和set方法
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public List<User> query() {
		return userDao.query();
	}
}
