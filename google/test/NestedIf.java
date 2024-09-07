package com.sritech.google.test;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		System.out.println("Students Marks");
		Scanner sc=new Scanner(System.in);
		System.out.println("1st sub marks");
		int n1=sc.nextInt();
		
		System.out.println("1st sub marks");
		int n2=sc.nextInt();
		
		System.out.println("1st sub marks");
		int n3=sc.nextInt();
		
		if(n1>40)
		{
			if(n2>40)
			{
				if(n3>40)
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
			}
			else
			{
				System.out.println("Fail");
			}
		}
		else{
			System.out.println("Fail");
		}
	}

}
