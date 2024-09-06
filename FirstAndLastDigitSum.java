package com.sritech.pushpa.com;

public class FirstAndLastDigitSum {
	public static void main(String[] args) {
		int n=1234;
		int firstnum=0;
		int lastnum=n%10; 
		while(n>=1)
		{
			firstnum=n%10;
			n=n/10;     
		}
		System.out.println(firstnum+lastnum);
	}

}
