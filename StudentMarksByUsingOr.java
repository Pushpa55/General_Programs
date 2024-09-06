package com.sritech.pushpa.com;
import java.util.Scanner;
public class StudentMarksByUsingOr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sub1 Marks ");
		
		int m1 = sc.nextInt();
		
		System.out.println("Enter sub2 Marks ");
		
		int m2 = sc.nextInt();
		
		System.out.println("Enter sub3 Marks ");
		
		int m3 = sc.nextInt();
			   
		if( m1<40 || m2<40 || m3<40 )
		{    	
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		
						
	}	



}
