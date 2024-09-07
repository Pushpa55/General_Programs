package com.sritech.collections;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Kotcherla");
		list.add("Naga");
		list.add("Pushpa");
		list.add("Latha");
		list.add("Arjun");
		
		ArrayList<String> copyList = ( ArrayList<String> )list.clone();
		
		System.out.println("After cloning");
		System.out.println(list);
		System.out.println(copyList);
		
		copyList.add("Mani Kumar");
		copyList.add("Saraswathi");
		
		System.out.println("Ater changing");
		System.out.println(list);
		System.out.println(copyList);
		
		if(copyList==list)
		{
			System.out.println("Same location");
			System.out.println("Clone failed");
		}
		else
		{
			System.out.println("Different location");
			System.out.println("Clone successfully");
		}
		
		

	}

}
