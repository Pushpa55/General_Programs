package com.sritech.collections;

import java.util.ArrayList;

public class AddingIndex {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("kotcherla");
		list.add("naga");
		list.add("pushpa");
		list.add("latha");
		
		System.out.println(list);
		
		String str=list.get(0);
		System.out.println(str);
		
		list.add(0, "kkk");
		
		list.add(4, "ppp");
		System.out.println(list);
	}

}
