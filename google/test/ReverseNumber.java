package com.sritech.google.test;

import java.util.Scanner;

public class ReverseNumber {
	 static public void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println("Reverse Number:"+sum);
		
	}

}
