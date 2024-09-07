package com.sritech.exceptions;

public class GetMessage {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b;
			int n=args.length;
			b=a/n;
			System.out.println("Result :"+b);
			System.out.println("try ended");
		}
		catch(ArithmeticException e)
		{
			String msg=e.getMessage();
			
			System.out.println("Divided by zero"+msg);
			e.printStackTrace();
		}
	}

}
