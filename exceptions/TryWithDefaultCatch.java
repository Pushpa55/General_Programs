package com.sritech.exceptions;

public class TryWithDefaultCatch {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("No.of arguments:"+b);
			System.out.println("Result :"+n);
			System.out.println("First args:"+args[0]);
			System.out.println("Second args:"+args[1]);
			System.out.println("Third args:"+args[2]);
			System.out.println("Fourth args:"+args[3]);
			System.out.println("Fivith args:"+args[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero :"+e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Some indexes are missing :"+e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format are wrong :"+e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Exception :"+e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Default Exception :"+e.getMessage());
			e.printStackTrace();
		}
	}

}
