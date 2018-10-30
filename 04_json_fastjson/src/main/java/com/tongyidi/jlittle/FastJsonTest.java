package com.tongyidi.jlittle;

import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * fastJson测试,非常简单，建议去https://github.com/alibaba/fastjson看下。
 *
 */
public class FastJsonTest {
	public static void main(String[] args) {
		User user = new User();
		user.setName("校长");
		user.setAge(3);
		user.setSalary(new BigDecimal("123456789.0123"));
		String jsonString = JSON.toJSONString(user);
		String jsonString2 = JSONObject.toJSONString(user);
		System.out.println(jsonString);
		System.out.println(jsonString2);

		String jsonString3 = "{\"age\":3,\"birthdate\":1496738822842,\"name\":\"校长\",\"old\":true,\"salary\":123456789.0123}";
		User u = JSON.parseObject(jsonString3, User.class);
		System.out.println(u.toString());
		// 输出 校长

		String jsonStringArray = "[{\"age\":3,\"birthdate\":1496738822842,\"name\":\"校长\",\"old\":true,\"salary\":123456789.0123},{\"age\":3,\"birthdate\":1496738822842,\"name\":\"校长\",\"old\":true,\"salary\":123456789.0123}]";
		List<User> userList = JSON.parseArray(jsonStringArray, User.class);
		System.out.println(userList.size());
	}
}
