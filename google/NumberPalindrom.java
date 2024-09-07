package com.sritech.google;

import java.util.Scanner;

public class NumberPalindrom {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		int sum =0;
		
		int temp=n;
		
		int i=1 ;
		
		while(i<=n)
		{
			int r=n%10;
			
			sum=sum*10+r;
			
			n=n/10;	
		}
		if(sum==temp)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
