package com.ronghuanet._03generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _01Generic {

	public static <V, K> void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		/*
		 * The method add(int, String) in the type 
		 * ArrayList<String> is not applicable for the arguments (int)
		 */
		list.add("sdf1");
		list.add("sdf2");
		list.add("sdf3");
		list.add("sdf4");
		list.add("sdf5");
		
		HashMap<String, String> map = new HashMap<String, String>();
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			entry.getKey();
			entry.getValue();
		}
	}

}
