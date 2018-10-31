package com.tongyidi.jlittle.hashmap;

import java.util.HashMap;
import java.util.Map;

public class BaseOption {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("no1", "gavinlee");
		map.put("nullvalue", null);
		map.put(null, "this is also null");//可以插入null键
		
		for(String key:map.keySet()){
			System.out.println(map.get(key));
		}
	}
}
