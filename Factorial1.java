package com.sritech.pushpa.com;

import java.util.Scanner;

public class Factorial1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		     fact=fact*i;   
		}
		System.out.println("Factorial of "+n+" = "+fact);
		
		}

}
