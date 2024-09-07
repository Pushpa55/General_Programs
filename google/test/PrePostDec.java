package com.sritech.google.test;

public class PrePostDec {
	public static void main(String[] args)
	{
		int a=10;
		int b;
		int c;
		int d;		
		
		b=--a;		 //a=9,b=9		
		c=b++;		 //b=10,c=9
		d=--c;		 //c=8,d=8
		a=++b;		 //b=11,a=11
		d=a--;       //a=10,d=11
		
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);	
	}


}
