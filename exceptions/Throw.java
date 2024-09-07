package com.sritech.exceptions;

public class Throw {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int n=args.length;
			int b;
			if(n==0)
			{
				throw new ArithmeticException();
			}
			b=a/n;
			System.out.println("No.of arguments:"+n);
			System.out.println("Result :"+b);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main ended");
	}

}
