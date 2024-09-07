package com.sritech.google;

public class StringPalindrom {
	
	public static void main(String[] args) {
		
		String s="MALAYALAM";
		
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		
		String string = sb.toString();
		
		System.out.println(string);
		
		if(s.equals(string))
		{
			System.out.println("It's a palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
		
	}

}
