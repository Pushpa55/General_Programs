package com.sritech.google.test;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Your number is positive");
		}
		else if(n<0)
		{
			System.out.println("Your number is negative");
		}
		else
		{
			System.out.println("Your number is zero");
		}
	}

}
