package com.sritech.google.test;
import java.util.Arrays;;

public class ArraySort {
	public static void main(String[] args) {
		int a[]={12,10,3,21,65,23,98,45,2,0,1,34};
		
		System.out.println("Before Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println("After Sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
