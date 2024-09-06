package com.sritech.pushpa.com;

import java.util.Scanner;

public class PrintSeries {
	public static void main(String[] args) {
		int firstnum=1;
		int secondnum=2;                  //n=10----1,2,3,5,5,8,7,11,9,14
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		while(firstnum<=n)          
		{
			System.out.println(firstnum);
			System.out.println(secondnum);
			firstnum=firstnum+2;
			secondnum=secondnum+3;
		}
	}

}
