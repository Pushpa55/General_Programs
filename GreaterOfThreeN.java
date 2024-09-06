package com.sritech.pushpa.com;

import java.util.Scanner;

public class GreaterOfThreeN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your 2st number");
		int n2=sc.nextInt();
		
		System.out.println("Enter your 3st number");
		int n3=sc.nextInt();
		
		if(n1>n2)
		{
			if(n1>n3){
			 System.out.println("n1 is greater");
			}
			else
			{
				System.out.println("n3 is greater");
			}
		}
		else if(n2>n3)
		{
			System.out.println("n2 is greater");
		}
		else
		{
			System.out.println("n3 is greater");
		}
		
	}

}
