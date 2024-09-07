package com.sritech.exceptions;

public class Employee {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			System.out.println("try starts");
			int a=10;
			int b=args.length;
			int n=a/b;
			int empNum=Integer.parseInt(args[0]);
			String empName=args[1];
			double empSalary=Double.parseDouble(args[2]);
			String empGender=args[3];
			int empAge=Integer.parseInt(args[4]);
			System.out.println(empNum+"\t"+empName+"\t"+empSalary+"\t"+empGender+"\t"+empAge);
			
			System.out.println("Result:"+n);
			System.out.println("try ends");
		}
		catch(ArithmeticException e)
		{
			String msg=e.getMessage();
			e.printStackTrace();
			System.out.println("Divided by zero"+msg);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			String msg=e.getMessage();
			e.printStackTrace();
			System.out.println("Missing some fields"+msg);
		}
		catch(NumberFormatException e)
		{
			String msg=e.getMessage();
			e.printStackTrace();
			System.out.println("Non numberic value received"+msg);
		}
		catch(NullPointerException e)
		{
			String msg=e.getMessage();
			e.printStackTrace();
			System.out.println("null reference"+msg);
		}
		System.out.println("Main ends");
		
	}

}
