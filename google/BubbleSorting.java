package com.sritech.google;

public class BubbleSorting {
	
	public static void main(String[] args) {
	       
		int[] a = {64, 34, 25, 12, 22, 11, 90};
	        
	        System.out.println("Before sorting");
	        
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.println(a[i]);
	        }
	       for(int i=0;i<a.length-1;i++)
	        {
	        	for(int j=0;j<a.length-1-i;j++)
	        	{
	        		if(a[j]>a[j+1])
	        		{
	        			int temp =a[j];
	        			
	        			a[j]=a[j+1];
	        			
	        			a[j+1]=temp;
	        					
	        		}
	        	}
	        }
	      System.out.println("After sort");
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  System.out.println(a[i]);
	      } 
}
}
