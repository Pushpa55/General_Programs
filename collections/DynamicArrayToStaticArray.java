package com.sritech.collections;

import java.util.ArrayList;

public class DynamicArrayToStaticArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Kotcherla");
		list.add("Main Kumar");
		list.add("Saraswathi");
		list.add("Naga Lakshmi");
		list.add("Linga Babu");
		list.add("Pushpa");
		
		Object[] objects=list.toArray();
		
		for(Object object : objects)
		{
			String str=(String) object ;
			System.out.println(str);
		}
		
		
	}

}
