package com.sritech.pushpa.com;

import java.util.Scanner;

public class GreaterNumberByUsingTernary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your 2nd number");
		int n2=sc.nextInt();
		
		int big=n1>n2? n1 :n2;
		System.out.println("Greater number ="+big);
		
	}

}
