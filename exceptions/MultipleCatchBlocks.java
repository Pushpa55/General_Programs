package com.sritech.exceptions;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("Result="+n);
			System.out.println("First arg:"+args[0]);
			System.out.println("Second arg:"+args[1]);
			System.out.println("Third arg:"+args[2]);
			System.out.println("Fourth arg:"+args[3]);
			System.out.println("Fivith arg:"+args[4]);
			System.out.println("try ends");
			
		}
		catch(ArithmeticException e)
		{
			String msg=e.getMessage();
			System.out.println("Divided by zero:"+msg);
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			String msg=e.getMessage();
			System.out.println("Some arrays indexes are missing:"+msg);
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

}
