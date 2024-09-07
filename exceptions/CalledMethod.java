package com.sritech.exceptions;

public class CalledMethod {
	
	public static void main(String[] args) {
		
		System.out.println("main starts");
	
		display(args);
		
		System.out.println("main ended");
	}

	public static void display(String[] args) 
	{
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int c=a/b;
			System.out.println(c);
			System.out.println("try ended");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	

}
