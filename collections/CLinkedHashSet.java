package com.sritech.collections;

import java.util.LinkedHashSet;

public class CLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedSet=new LinkedHashSet<String>();
		
		linkedSet.add("Java");
		linkedSet.add("Oracle");
		linkedSet.add("Python");      // it's maintain insertion order
		linkedSet.add("Linux");
		linkedSet.add("Unix");        // don't allow duplicate elements
		linkedSet.add("Spring");
		linkedSet.add("Java");
		
		System.out.println(linkedSet);
	}

}
