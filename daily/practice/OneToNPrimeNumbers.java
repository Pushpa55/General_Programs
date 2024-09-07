package com.sritech.daily.practice;

public class OneToNPrimeNumbers {
	
	public static void main(String[] args) {
		
		int n=20;
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Pirme ="+i);
			}
			else
			{
				System.out.println("Not prime ="+i);
			}
		}
	}

}
