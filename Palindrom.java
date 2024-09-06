package com.sritech.pushpa.com;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		int temp=n;
		while(i<=n)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;	
		}
		if(sum==temp)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}

}
