package com.sritech.exceptions;

public class CalledMethodAndCallingMethod {
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println("try starts");
			display(args);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

	public static void display(String[] args)
	{
		try
		{
		   int a=10;
		   int b=args.length;
		   int c=a/b;
		   System.out.println(c);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
