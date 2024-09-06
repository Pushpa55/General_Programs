package com.sritech.pushpa.com;

import java.util.Scanner;

public class Cricket {
	public static void main(String[] args)  {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the cricket score ");
		
		int score =sc.nextInt();
		
		if(score<0)
		{
			System.out.println("Invalid Input");
		}		
		else if(score==0)
		{
			System.out.println("Duck out");
		}
		else if(score<50)
		{
			System.out.println("Normal score");
		}
		else if(score<100) 
		{
			System.out.println("Half Century");
		}
		else if(score<200) 
		{
			System.out.println("Century");
		}
		else 
		{
			System.out.println("Double Century");
		}						
			
	}


}
