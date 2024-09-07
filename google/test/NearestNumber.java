package com.sritech.google.test;

import java.util.Scanner;

public class NearestNumber {
	
	 static int nearestTo100(int input1, int input2)
	    {
	        int diff1 = Math.abs(100 - input1);
	 
	        int diff2 = Math.abs(100 - input2);
	 
	        if(diff1 < diff2)
	        {
	            return input1;
	        }
	        else if (diff2 < diff1)
	        {
	            return input2;
	        }
	        else
	        {
	            return input1;
	        }
	    }
	 
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("Enter First Number");
	        int input1 = sc.nextInt();
	 
	        System.out.println("Enter Second Number");
	        int input2 = sc.nextInt();
	 
	        System.out.println(nearestTo100(input1, input2));
	    }

}
