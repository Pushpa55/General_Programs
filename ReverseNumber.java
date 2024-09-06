package com.sritech.pushpa.com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;   //  1221%10-->1,  122%10-->2,  12%10-->2,  1%10-->1
			sum=sum*10+rem; //  0*10+1--> 1,  1*10+2-->10+2=12,  12*10+2=120+2=122,  122*10+1=1220+1=1221
			n=n/10;          // 1221/10-->122,  122/10-->12,   12/10-->1 
		}
		System.out.println("Reverse Number:"+sum);
	
	}

}
