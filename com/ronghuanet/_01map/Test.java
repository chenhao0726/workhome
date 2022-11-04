package com.ronghuanet._01map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {
        HashMap map1 = new HashMap();
        map1.put(new Student("zs",23),1);
        map1.put(new Student("zs",23),2);
        map1.put(new Student("xm",22),3);

        map1.forEach((student,value)-> System.out.println(student+"=="+value));
    }
}
