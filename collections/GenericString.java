package com.sritech.collections;

import java.util.ArrayList;

public class GenericString {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("Before adding Strings:"+list.size());
		
		list.add("KOTCHERLA");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		list.add("LAKSHMI");
		
		System.out.println("After adding Strings:"+list.size());
		
		System.out.println("List of Strings"+list); // call to overriding toString() of ArrayList
	}

}
