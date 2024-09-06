package com.sritech.pushpa.com;

public class ReverseString {
	public static void main(String[] args) {
		String s="malayalam";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String result=sb.toString();
		//System.out.println(result);
		if(result.equals(s))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}

}
