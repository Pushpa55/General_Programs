package com.sritech.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String [] words={"kotcherla","naga","pushpa","latha"};
		
		String [] str={"Kotcherla","Naga","Lakshmi"};
		
		List<String> list=new ArrayList<String>(Arrays.asList(words));
		
		List<String> list1=new ArrayList<String>(Arrays.asList(str));
		
		System.out.println(list);
		
		System.out.println(list1);
		
		
	}

}
