package com.sritech.pushpa.com;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your second number");
		int n2=sc.nextInt();
		
		if(n1>n2){
			System.out.println("Greater number of n1="+n1);
		}
		else
		{
			System.out.println("Greater number of n2="+n2);
		}
		
	}

}
