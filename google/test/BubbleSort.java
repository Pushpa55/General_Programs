package com.sritech.google.test;

public class BubbleSort {
	public static void main(String[] args) {
		int []a={10,8,4,12,45,27};
		int n=a.length;
		
		System.out.println("Before Sort");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sort");	
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+" ");
	    }
	}

}
