package com.sritech.collections;

import java.util.ArrayList;

public class ContainsAll {
public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Kotcherla");
		list1.add("Mani Kumar");
		list1.add("Saraswathi");
		list1.add("Naga Lakshmi");
		list1.add("Linga Babu");
		list1.add("Pushpa");
		list1.add("Latha");
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("Kotcherla");
		list2.add("NagaMalleswarao");
		list2.add("Lakshmi");
		list2.add("Nagini");
		list2.add("Kamalakar");
		list2.add("Bharmam");
		
		ArrayList<String> list3=new ArrayList<String>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("Before adding list1 elements :"+list1);
		System.out.println("Before adding list2 elements :"+list2);
		System.out.println("After adding list3 elements :"+list3);
		
		if(list3.containsAll(list1))
		{
			System.out.println("It's list3 contains all elements of list1 ");
		}
		else
		{
			System.out.println("No list3 don't have all elements of list1");
		}
		
		list3.remove("Pushpa");
		
		if(list3.containsAll(list1))
		{
			System.out.println("Yes it's list3 contains all elements of list1 ");
		}
		else
		{
			System.out.println("No list3 don't have all elements of list1");
		}
		
		
		
   }

}
