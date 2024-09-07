package com.sritech.exceptions;

public class NestedTryBlock {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			System.out.println("Outer try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("No.of arguments :"+a);
			System.out.println("Result :"+n);
			
			try
			{
				System.out.println("Inner try starts");
				System.out.println("First args:"+args[0]);
				System.out.println("Second args:"+args[1]);
				
				System.out.println("Third args:"+args[2]);
				
				System.out.println("Fourth args:"+args[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner try array index exception");
			}
			finally
			{
				System.out.println("Inner try finally");
			}
		
	   System.out.println("Outer try ended");
		}
		catch(ArithmeticException e)
			{
			System.out.println("Outer try divided by zero");
			}
		finally
		{
			System.out.println("Outer try finally");
		}
		System.out.println("Main ended");
		}
}

