package com.sritech.pushpa.com;

import java.util.Scanner;

public class PrimeNumberOrNot {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number ");
		
		int n = sc.nextInt(); 
		int fc=0;     
		for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				fc++;
			}
		}
			if(fc==2)
			{
				System.out.print(n+" It's a prime number ");
			}
			else
			{
				System.out.println("Not prime");
		}
	}

}