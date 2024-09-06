package com.sritech.pushpa.com;

import java.util.Scanner;

public class PrimeNumberByUsingExit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime number");
				System.exit(0);
			}
	    }
		System.out.println("It is a prime number");

	}
	
	}
