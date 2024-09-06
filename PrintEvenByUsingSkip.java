package com.sritech.pushpa.com;

import java.util.Scanner;

public class PrintEvenByUsingSkip {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
				
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
