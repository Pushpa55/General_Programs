package com.sritech.pushpa.com;

import java.util.Scanner;

public class SumEvenAndOdd {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit");
		
		int n=sc.nextInt();
		
		int i=1;
		
		int evensum=0;
		
		int oddsum=0;
		
		while(i<=n)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;
			}
			i++;
		}
		System.out.println("Even Sum="+evensum);
		
		System.out.println("Odd Sum="+oddsum);
	}

}
