package com.sritech.exceptions;

public class NestedTry {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			System.out.println("outer try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("No.of arguments :"+args.length);
			System.out.println("Result :"+n);
			try
			{
				System.out.println("inner try starts");
				System.out.println("First args:"+args[0]);
				System.out.println("Second args:"+args[1]);
				System.out.println("Third args:"+args[2]);
				System.out.println("Fourth args:"+args[3]);
				System.out.println("inner try ended");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner try invalid index");
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Outer try non numberic value");
			}
			finally
			{
				System.out.println("IM in inner finally block");
			}
			System.out.println("Outer try ended");
		}
		catch(ArithmeticException e)	
		{
			System.out.println("Outer try divide by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("Outer try null reference");
		}
		finally
		{
			System.out.println("Im in outer finally block");
		}
	System.out.println("Main ended");		
	}

}
