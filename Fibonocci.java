package com.sritech.pushpa.com;

public class Fibonocci {
	public static void main(String[] args) {
		int f=0;
		int l=1;             // 0 1 1 2 3 5 8 13 21 34 
		int sum=0;           // 0+1=1; 1+1=2; 1+2=3; 2+3=5; 3+5=8;
		while(l<=30)         // A series of numbers,starting from 0 where every number 
		{                    // is the sum of the two numbers preceding it.
			System.out.println(f);
			
			sum=f+l;       // sum=0+1;----> sum=1
			
			f=l;           // f=1;
			
			l=sum;	
			
			//System.out.println(sum);// l=sum(1)
		}                                              //0112358132134
	}
                                                      //112358132134
}
