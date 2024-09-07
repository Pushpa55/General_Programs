package com.sritech.daily.practice;

import java.util.Scanner;

public class PrimeN {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				
				System.out.println("Not Prime");
				
				break;
			}
		}
		
		if(flag==true && n != 1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
			
		}
				
	}

}
