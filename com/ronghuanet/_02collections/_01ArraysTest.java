package com.ronghuanet._02collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _01ArraysTest {

	public static void main(String[] args) {
		List asList = Arrays.asList("a","c","f");
		
		HashMap map = new HashMap();
		map.put(1,1);
		map.put(2,2);
		map.put(3,3);
		map.put(5,5);
		Collection values = map.values();
		Object max = Collections.max(values);
		Object min = Collections.min(values);
		System.out.println(max);
		System.out.println(min);
	}

}
