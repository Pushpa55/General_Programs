package com.sritech.pushpa.com;

import java.util.Scanner;

public class SubjectWiseMarks {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Sub1 Marks ");
		
		int m1 = sc.nextInt();
		
		System.out.println("Eneter Sub2 Marks ");
		
		int m2 = sc.nextInt();
		
		System.out.println("Eneter Sub3 Marks ");
		
		int m3 = sc.nextInt();
		
		System.out.println("Eneter Sub4 Marks ");
		
		int m4 = sc.nextInt();
		
		int passCount = 0; 
		  
		if( m1>=40 )
		{
			passCount++;
			
			System.out.println("Sub1 Passed ");
		}
		else
		{
			System.out.println("Sub1 Failed ");
		}
		    
		if( m2>=40 )
		{
			passCount++;
			System.out.println("Sub2 Passed ");
		}
		else
		{
			System.out.println("Sub2 Failed ");
		}
            
		if( m3>=40 )
		{
			passCount++;
			System.out.println("Sub3 Passed ");
		}
		else
		{
			System.out.println("Sub3 Failed ");
		}
		    
		if( m4>=40 )
		{
			passCount++;
			System.out.println("Sub4 Passed ");
		}
		else
		{
			System.out.println("Sub4 Failed ");
		}
		
		if( passCount >= 3 )
		{
			System.out.println("Student Passed");
		}
		else
		{
			System.out.println("Student Failed");
		}
		
			
	}
	


}
