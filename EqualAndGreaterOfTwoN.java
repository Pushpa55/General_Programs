package com.sritech.pushpa.com;

import java.util.Scanner;

public class EqualAndGreaterOfTwoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your 2nd number");
		int n2=sc.nextInt();
		
		if(n1==n2)
		{
			System.out.println("Both are equal");
		}
		else if(n1>n2)
		{
			System.out.println("Greater number of n1="+n1);
		}
		else
		{
			System.out.println("Greater number of n2="+n2);
		}
	}

}
