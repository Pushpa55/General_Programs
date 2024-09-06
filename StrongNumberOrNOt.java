package com.sritech.pushpa.com;

import java.util.Scanner;

public class StrongNumberOrNOt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;                   /*Sum of factorial of each digit of the number 
		                             must be equal to the number itself 
		                             1!+4!+5!=145 */
		while(n>0)
		{
			int r=n%10;
			int fact;
			for(fact=1;r>=1;r--)
			{
				fact=fact*r;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("sum="+sum);
		{
	     if(sum==temp)
	     {
	    	 System.out.println("Strong Number");
	     }
	     else
	     {
	    	 System.out.println("Not a strong number");
	     }
			
		}
	}

}
