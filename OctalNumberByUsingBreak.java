package com.sritech.pushpa.com;

import java.util.Scanner;

public class OctalNumberByUsingBreak {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int n=sc.nextInt();
		
		boolean flag = true;  
	    
	    while( n>0 )
		{
			int r = n%10;
			
			if( r > 7)
			{
				flag=false;
				
				System.out.println("not an Octal number");
				
				break;
			}
			
			n = n / 10;
		}
		if( flag )
		{
			System.out.println("it is an octal number");
		}
	}

}
