package com.ronghuanet._01map;

import java.util.TreeMap;

public class _06TreeMapTest {

	public static void main(String[] args) {
		// TreeMap 和 TreeSet是一样的 需要排序才可以
		TreeMap tree = new TreeMap();
//		tree.put(5, 5);
//		tree.put(3, 3);
//		tree.put(2, 2);
//		tree.put(4, 4);
		tree.put(new User("zs", 20), 1);
		tree.put(new User("zs", 25), 1);
		tree.put(new User("zs", 22), 1);
		System.out.println(tree);
		DogComparator dogComparator = new DogComparator();
		TreeMap tree1 = new TreeMap(dogComparator);
		tree1.put(new Dog("旺财",2), 1);
		tree1.put(new Dog("来福",5), 1);
		tree1.put(new Dog("张铁军",2), 1);
		tree1.put(new Dog("李铁牛",3), 1);
		System.out.println(tree1);
	}

}
