package com.sritech.google.test;

public class IncrementAndDec2 {
	public static void main(String[] args){
		int a=10;
		int b;
		int c;
		int d;
		
		b=a++;		//a=11,b=10
		c=++b;		//b=11,c=11
		d=c++;		//c=12,d=11
		b=d++;		//d=12,b=11
		a=++c;		//c=13,a=13
		System.out.println (a+"\t"+b+"\t"+c+"\t"+d);		
	}


}
