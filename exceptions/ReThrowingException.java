package com.sritech.exceptions;

public class ReThrowingException {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			display(args);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("main end");
	}
		public static void display(String[] args)
		{
			try
			{
				System.out.println("try starts");
				int a=10;
				int b=args.length;
				int c=a/b;
				System.out.println("Result c="+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divided by zero");
				throw e;
			}
			
		}
	
		
}

