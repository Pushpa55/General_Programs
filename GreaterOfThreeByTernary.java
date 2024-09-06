package com.sritech.pushpa.com;

import java.util.Scanner;

public class GreaterOfThreeByTernary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your 2st number");
		int n2=sc.nextInt();
		
		System.out.println("Enter your 3st number");
		int n3=sc.nextInt();
		
		int big=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println("Greater of three numbers="+big);
		
	}

}
