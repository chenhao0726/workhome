package com.ronghuanet._01map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _04LinkedHashMapLoop {
	public static void main(String[] args) {
		// 创建一个HashMap对象
		LinkedHashMap map1 = new LinkedHashMap();
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
		System.out.println("================循环方式一:获取所有的key值 并遍历=============");
		Set keySet = map1.keySet();// 通过map的keyset方法获取所有的key值得set集合
		System.out.println("-----增强for遍历--------");
		for (Object o : keySet) {
			System.out.println(o);
		}
		System.out.println("-----迭代器遍历--------");
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("================循环方式二:获取所有的value值 并遍历=============");
		Collection values = map1.values();// 通过map1的values()方法获取 value的集合
		System.out.println("-----通过迭代器遍历values集合 Collection类型-------");
		// 通过迭代器的方式去遍历
		Iterator iterator2 = values.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("================循环方式三:获取所有的key-value的EntrySet 并遍历=============");
		// 通过 entrySet()方法 拿到set集合里面装的是entry对象key-value的集合
		Set entrySet = map1.entrySet();
		System.out.println("-----------增强for遍历---------------");
		for (Object o : entrySet) {
			Entry entry = (Entry)o;
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		System.out.println("-----------迭代器遍历---------------");
		Iterator iterator3 = entrySet.iterator();
		while(iterator3.hasNext()) {
			Entry entry = (Entry)iterator3.next();
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		System.out.println("================循环方式四: 遍历=============");
		
		
	}
}
