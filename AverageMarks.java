package com.sritech.pushpa.com;

import java.util.Scanner;

public class AverageMarks {
public static void main(String [] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sub1 Marks");
		
		int m1 = sc.nextInt();
		
		
		System.out.println("Enter sub2 Marks");
		
		int m2 = sc.nextInt();
		
		
		System.out.println("Enter sub3 Marks");
		
		int m3 = sc.nextInt();
		
		
		if(  m1>=40 && m2>=40 && m3>=40 )
		{	
			
			int avg = ( m1 + m2 + m3 ) / 3;  
			
			if( avg>=90 )
			{
				System.out.println("Passed and Grade A");
			}
			else if( avg >= 80 )
			{
				System.out.println("Passed and Grade B");
			}
			else if( avg >= 70  )
			{
				System.out.println("Passed and Grade C");
			}
			else if( avg >= 60  )
			{
				System.out.println("Passed and Grade D");
			}
			else 
			{
				System.out.println("Passed and Grade E");
			}	
			
			
		}
		else
		{
			System.out.println("Failed and No Grade");
		}
		
	}


}
