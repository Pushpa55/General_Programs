package com.sritech.google.test;

import java.util.Scanner;

public class StringVowels {
    
    enum Vowels {A,E,I,O,U};
     
	 public static void main(String[] args)
      {

       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter your string");
       
       String word=sc.nextLine();
       
       for(int i=0;i<word.length();i++)
       {
    	   for(Vowels v :Vowels.values())
    	   {
    		   if((word.charAt(i)+"").equalsIgnoreCase(v.name()))
    		   {
    			   System.out.println(word.charAt(i));
    		   }
    	   }
       }
       }
       
}

