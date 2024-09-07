package com.sritech.exceptions;

public class Throws1 {
	public static void main(String[] args) throws ThrowsSample {
		System.out.println("Main starts");
		try
		{
			display(args);
			throw new ThrowsSample("Sample exception");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("main end");
		
	    }

	   public static void display(String[] args) throws ThrowsSample
	   {
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int c=a/b;
			System.out.println("Result c:"+c);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
	}

}
