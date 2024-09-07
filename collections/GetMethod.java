package com.sritech.collections;

import java.util.ArrayList;

public class GetMethod {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("Before adding elements:"+list.size());
		
		list.add("KOTCHERLA");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		list.add("LAKSHMI");
		list.add("SARASWATHI");
		list.add("MANI KUMAR");
		
		System.out.println("After adding elements:"+list.size());
		
		System.out.println("By using get method");
		
	   String str=list.get(0);
	   System.out.println(str);
	   String str1 = list.get(1);
	   System.out.println(str1);
	   
	   
		
	}

}
