package com.sritech.collections;

import java.util.TreeSet;

public class CTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("Python");
		treeSet.add("Java");
		treeSet.add("Linux");                // it's maintain ascending order
		treeSet.add("Unix");
		treeSet.add("Oracle");              // don't allow duplicate elements
		treeSet.add("Python");
		
		System.out.println(treeSet);
	}

}
