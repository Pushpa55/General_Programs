package com.sritech.google.test;

public class IncrementAndDec3 {
	public static void main(String[] args)
	{
		int a=10;
		int b;
		int c;
		int d;
		
		d=++a;		//a=11,d=11
		b=d++;		//d=12,b=11
		a=++b;		//b=12,a=12
		c=d++;		//d=13,c=12	
		d=++c;      //c=13,d=13
		
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);		
	}


}
