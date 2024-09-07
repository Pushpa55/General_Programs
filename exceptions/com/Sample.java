package com.sritech.exceptions.com;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int n=0;
			int b=a/n;
			System.out.println("b="+b);
			System.out.println("try ends");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero");
			
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}

}
