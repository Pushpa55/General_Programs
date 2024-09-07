package com.sritech.collections;

import java.util.HashSet;

public class ChashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("Java");
		hashSet.add("Python");            // don't maintain insertion order
		hashSet.add("Linux");             //  don't allow duplicate elements
		hashSet.add("Unix");
		hashSet.add("Java");
		hashSet.add("Oracle");
		hashSet.add("Spring");
		
		System.out.println(hashSet);
	}

}
