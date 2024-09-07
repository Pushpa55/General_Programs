package com.sritech.google;

import java.util.Scanner;

public class OctalNumberByUsingBreak {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		boolean flag = true;
		
		while(n>0)
		{
			int r=n%10;
			
			if(r>7)
			{
				flag  = false;
				
				System.out.println("Not an octal");
				
				break;
			}
			
			n=n/10;
		}
		if(flag)
		{
			System.out.println("An octal");
		}
	}

}
