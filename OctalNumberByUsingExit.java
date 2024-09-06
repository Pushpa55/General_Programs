package com.sritech.pushpa.com;

import java.util.Scanner;

public class OctalNumberByUsingExit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		while(n>0)
		{                               //octal numbers=0-7 
			int rem=n%10;
			if(rem>7)
			{
				System.out.println("It is not an octal number");
				System.exit(0);
			}
			n=n/10;
		
		}
		System.out.println("It is an octal number");

	
	}

}
