package com.ronghuanet._03generic;

import java.util.ArrayList;
import java.util.List;

public class _04Bounds {

	public static void main(String[] args) {
		// extends 表示继承
		ArrayList<A> list1 = new ArrayList();
		ArrayList<B> list2 = new ArrayList();
		ArrayList<C> list3 = new ArrayList();
		ArrayList<D> list4 = new ArrayList();
		//The method test(List<? extends B>) 
		// in the type _04Bounds is not applicable for the arguments (ArrayList<A>)
//		test(list1);
		test(list2);
		test(list3);
		test(list4);
		
		test1(list1);
		test1(list2);
		test1(list3);
//		test1(list4);
		
	}
	
	public static void test(List<? extends B> list) {
		
	}
public static void test1(List<? super C> list) {
		
	}
}
