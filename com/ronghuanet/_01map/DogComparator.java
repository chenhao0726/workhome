package com.ronghuanet._01map;

import java.util.Comparator;

public class DogComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 == null || o2 == null) {
			return 0;
		}
		if(o1.getClass() == Dog.class && o2 instanceof Dog) {
			Dog d1 = (Dog)o1;
			Dog d2 = (Dog)o2;
			if(d1.age > d2.age) {
				return 1;
			}else if(d1.age < d2.age){
				return -1;
			}else {
				return d1.name.compareTo(d2.name);
			}
		}
		return 0;
	}

}
