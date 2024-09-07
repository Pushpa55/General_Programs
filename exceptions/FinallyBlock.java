package com.sritech.exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int c=a/b;
			System.out.println("No.of arguments:"+b);
			System.out.println("Result :"+c);
			System.out.println("First args:"+args[0]);
			System.out.println("Second args:"+args[1]);
			System.out.println("Third args:"+args[2]);
			System.out.println("Fourth args:"+args[3]);
			System.out.println("Fivith args:"+args[4]);
			System.out.println("try ends");
			
	    }
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException:"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Im in finally block");
		}
		System.out.println("Main ends");
		
	}
}
