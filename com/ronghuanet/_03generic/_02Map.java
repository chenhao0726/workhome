package com.ronghuanet._03generic;

public class _02Map {
	int x;
	int y;
}
class Point<T>{    // 表示在类声明了一个符号  数据类型，是一种泛指
	T x;
	T y;
}
class Test1{
	public static void main(String[] args) {
//		_02Map _02Map = new _02Map();
		Point<String> p = new Point<String>();
		//p.x;// 是String类型
		Point<Integer> p1 = new Point<Integer>();
//		Point<int> p1 = new Point<int>();
		// p1.x// 是Integer类型
	}
}