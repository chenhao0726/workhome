package com.ronghuanet._01map;

import java.util.HashMap;

public class _01HashMapTest {
	public static void main(String[] args) {
		// 创建一个HashMap对象
		HashMap map1 = new HashMap();
//		HashMap map2 = new HashMap(map1);
		// 往map中放值 只用put()方法 并且放的是键值对
		map1.put("","");
		map1.put("1","1");
		map1.put(1,7);
		map1.put(new User("wzg", 22),1);
		map1.put(null,"1");
		map1.put("2",null);
//		map1.put(null,null);
		map1.put("1",new User("wb", 21));
		System.out.println(map1);
		
		// 从map中取值 使用get()方法 通过key拿到对应的value
		System.out.println(map1.get(1));
		System.out.println(map1.get("1"));
		System.out.println(map1.get(new User("wzg", 22)));
		System.out.println(map1.get(null));
		System.out.println(map1.get("2"));
		System.out.println(map1.getOrDefault("233", "你个小呆瓜这个key是不存在的~"));
		System.out.println(map1.getOrDefault("1", "你个小呆瓜这个key是不存在的~"));
		
		System.out.println(map1.containsKey(""));
		System.out.println(map1.containsValue("2356"));
		map1.remove("");
		System.out.println(map1);
	}
}
