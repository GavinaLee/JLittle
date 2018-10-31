package com.tongyidi.jlittle;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用spring管理bean。此方法需要配置xml。现在使用@Service @Repository 等注解更方便更快捷。
 * @author gavinlee
 *
 */
public class UserTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbcTemplate-bean.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		User user = new User();
		user.setName("前潜");
		user.setAge(16);
		user.setSalary(new BigDecimal("36555.225"));
		userService.addUser(user);
		//查询
		List<User> list = userService.query();
		list.stream().forEach(s -> System.out.println(s.toString()));
	}
}
