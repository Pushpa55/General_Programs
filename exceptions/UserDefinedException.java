package com.sritech.exceptions;

public class UserDefinedException {
	public static void main(String[] args) {
		System.out.println("Main starts ");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			if(b==0)
			{
				throw new SampleException("Sample user defined exception");
			}
			int c=a/b;
			System.out.println("Result :"+c);
			System.out.println("First args :"+args[0]);
			System.out.println("Second args :"+args[1]);
			System.out.println("Third args :"+args[2]);
		    System.out.println("Fourth args :"+args[3]);
	    }
		catch(SampleException e)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("Main ended");
	}

}
