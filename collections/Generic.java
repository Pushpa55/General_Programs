package com.sritech.collections;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Before adding elements:"+list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		
		System.out.println("After adding elements:"+list.size());
		System.out.println("List of elements"+list);
	}

}
