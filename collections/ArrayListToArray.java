package com.sritech.collections;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("kotcherla");
		list.add("naga");
		list.add("pushpa");
		list.add("latha");
		
		System.out.println(list);
		
		String[] words=list.toArray(new String[list.size()]);
		
		for(String word : words)
		{
		     System.out.println(word);
		}
		
	}

}
