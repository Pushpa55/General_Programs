package com.sritech.daily.practice;

public class TwinPrimeNumbers {
	
	public static void main(String[] args) {
		
		int n=20;
		
		int p1=0;
		
		int p2=0;
		
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
				p2=i;
				
			    if(p2-p1==2)
			    {
			    	System.out.println(p1+" "+p2);
			    }
			    p1=p2;
			}
		}
	}

}
