package com.sritech.collections;

import java.util.HashMap;

public class GenericHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap=new HashMap<Integer,String>();
		
		hMap.put(1, "Java");
		hMap.put(2, "SQL");    // value can be duplicated
		hMap.put(3, "Python");    // key is unique
		hMap.put(4, "Oracle");  // only one null key allowed
		hMap.put(5, "Linux");   // any no.of null values allowed
		hMap.put(6,"Unix");
		
		System.out.println(hMap);
		
		System.out.println("TO Get Values");
		
		System.out.println(hMap.get(1));
		System.out.println(hMap.get(2));
		System.out.println(hMap.get(3));
		System.out.println(hMap.get(4));
		System.out.println(hMap.get(5));
		System.out.println(hMap.get(6));
		
		System.out.println("To get the values");
		
		String value1 = hMap.get(1);
		String value2 = hMap.get(2);
		String value3 = hMap.get(3);
		String value4 = hMap.get(4);
		String value5 = hMap.get(5);
		String value6 = hMap.get(6);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		
	}

}
