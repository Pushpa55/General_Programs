package com.sritech.exceptions;

public class SkipCatchBlock {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int c=a/b;
			System.out.println("Result c="+c);
			System.out.println("try ended");
		}
		catch(ArithmeticException e)
		{
			System.exit(0);
			System.out.println("Divided by zero");
		}
		System.out.println("main ended");
	}

}
