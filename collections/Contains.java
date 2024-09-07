package com.sritech.collections;

import java.util.ArrayList;

public class Contains {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Before adding elements :"+list.size());
		list.add("KOTCHERLA");
		list.add("MANI KUMAR");
		list.add("SARASWATHI");
		list.add("NAGA LAKSHMI");
		list.add("LINGA BABU");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		System.out.println(list);
		System.out.println("After adding elements :"+list.size());
		if(list.contains("PUSHPA"))
		{
			System.out.println("Element is Contains");
		}
		else
		{
			System.out.println("Element is not Contains");
		}
		if(list.contains("pushpa"))
		{
			System.out.println("Element is contains");
		}
		else
		{
			System.out.println("Element is not contains");
		}
		
		
	}

}
