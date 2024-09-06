package com.sritech.pushpa.com;

import java.util.Scanner;

public class ArmstrongNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int temp=n;        //sum of cubes of each digits is equal to the number itself.
		int sum=0;         //153 = 1+5*3+3*3 =1+125+27 = 153
		while(n>0)
		{
			int rem=n%10;
			int c = rem*rem*rem;
			sum = sum+c;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("This is an armstrong number");
		}
		else
		{
			System.out.println("Your number is not an armstrong number");
		}
	}

}
