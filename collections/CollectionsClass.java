package com.sritech.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("kotcherla");
		list.add("naga");
		list.add("pushpa");
		list.add("latha");
		
		System.out.println(list);
		
		System.out.println("Max ="+Collections.max(list));
		System.out.println("Min ="+Collections.min(list));
		
		System.out.println("Before sorting :"+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting :"+list);
	}
	

}
