package com.sritech.exceptions;

public class SingleCatchMultipleExceptions {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			int a=10;
			int b=args.length;
			int n=a/b;
			System.out.println("No.of fields:"+b);
			System.out.println("Result:"+n);
			System.out.println("Main ends");
			int empNum=Integer.parseInt(args[0]);
			String empName=args[1];
			double empSalary=Double.parseDouble(args[2]);
			String empGender=args[3];
			int empAge=Integer.parseInt(args[4]);
			System.out.println(empNum+"\t"+empName+"\t"+empSalary+"\t"+empGender+"\t"+empAge);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException |NumberFormatException | NullPointerException e)		
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

}
