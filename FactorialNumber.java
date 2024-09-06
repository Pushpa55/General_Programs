package com.sritech.pushpa.com;

public class FactorialNumber {
	public static void main(String[] args) {
		int fact=1;
		int i=1;
		int n=5;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
