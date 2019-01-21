package com.tongyidi.jlittle.hashmap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.tongyidi.jlittle.vo.User;

/**
 * HashMap 可以存放null值，null键，也可以以实例对象为key。
 * 
 * HashMap 初始数组是16，负载因子是0.75，当元素个数超过16*0.75 =12的时候，开始扩容，扩容为2倍。
 * 
 * HashMap 是非同步的，当多线程操作时候有可能会出现链表死循环。
 * 
 * 其中loadFactor加载因子是表示Hsah表中元素的填满的程度.
 * 
 * 若:加载因子越大,填满的元素越多,好处是,空间利用率高了,但:冲突的机会加大了.链表长度会越来越长,查找效率降低。
 * 
 * 反之,加载因子越小,填满的元素越少,好处是:冲突的机会减小了,但:空间浪费多了.表中的数据将过于稀疏（很多空间还没用，就开始扩容了）
 * 
 * 冲突的机会越大,则查找的成本越高.因此,必须在 "冲突的机会"与"空间利用率"之间寻找一种平衡与折衷.
 * 
 * 这种平衡与折衷本质上是数据结构中有名的"时-空"矛盾的平衡与折衷.
 * 
 * 如果机器内存足够，并且想要提高查询速度的话可以将加载因子设置小一点；相反如果机器内存紧张，并且对查询速度没有什么要求的话可以将加载因子设置大一点。不过一般我们都不用去设置它，让它取默认值0.75就好了。
 *
 */
public class BaseOption {
	public static void main(String[] args) {
		User userkey = new User();
		userkey.setName("gavin");
		userkey.setAge(26);
		userkey.setSalary(new BigDecimal(336.555));
		User user2 = new User();
		user2.setAge(33);
		user2.setName("qiang");
		user2.setSalary(new BigDecimal(6669.554));

		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("string", "string");
		map.put(1, 123);
		map.put(2, 123);
		map.put(null, "this is also null");// 可以插入null键
		map.put(userkey, userkey);// 可以把对象当成key
		map.put(user2, userkey);// key和 value都可以放对象实例
      
		// 第一种：普遍使用，二次取值
		System.out.println("通过Map.keySet遍历key和value：");
		for (Object key : map.keySet()) {// 第一种遍历
			System.out.println(key + ":" + map.get(key));
		}
		// 第二种
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Object, Object> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		// 第三种：推荐，尤其是容量大时
		System.out.println("通过Map.entrySet遍历key和value");
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		// 第四种
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		for (Object v : map.values()) {
			System.out.println("value= " + v);
		}
	}
}
