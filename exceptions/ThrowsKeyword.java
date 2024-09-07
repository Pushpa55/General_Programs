package com.sritech.exceptions;

public class ThrowsKeyword {
	public static void main(String[] args) throws ThrowsSample {
		System.out.println("Main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=1;
			if(b==0)
			{
				throw new ThrowsSample("Sample Throws");
			}
			int c=a/b;
			System.out.println("Result c: "+c);
			System.out.println("Main ended");
		}
		catch(ThrowsSample e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}
