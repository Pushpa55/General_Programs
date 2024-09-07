package com.sritech.exceptions;

public class CatchMultipleExceptions {
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("Total args:"+b);
			System.out.println("Result:"+n);
			int empNum=Integer.parseInt(args[0]);
			String empName=args[1];
			int empAge=Integer.parseInt(args[2]);
			String empGender=args[3];
			double empSalary=Double.parseDouble(args[4]);
			System.out.println(empNum+"\t"+empName+"\t"+empAge+"\t"+empGender+"\t"+empSalary);
			System.out.println("try ends");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException | NullPointerException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

}
