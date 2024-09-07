package com.sritech.google.test;

public class PrePostDec2 {
	public static void main(String[] args)
	{
		int a = 10;
		int b;
		int c;
		int d;

		d = a--;    //a=9,d=10
		b = ++d;    //d=11,b=11
		c = a++;    //a=10,c=9
		a = --b;    //b=10,a=10
		d = c++;    //c=10,d=9

		System.out.println (a + "\t" + b + "\t" + c + "\t" + d);		
	}


}
