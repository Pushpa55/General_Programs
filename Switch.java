package com.sritech.pushpa.com;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter your 2nd number");
		int n2=sc.nextInt();
		
		System.out.println("Mathmetical Operations");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("Enter your choice 1/2/3");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("1.Addition:"+(n1+n2));
		        break;
		case 2: System.out.println("2.Substraction:"+(n1-n2));
		        break;
		case 3: System.out.println("3.Multiplication:"+(n1*n2));
		        break;
		default: System.out.println("Wrong choice");        
		}
		System.out.println("End");
	}
}
