package com.sritech.constructors.com;

public class BothDefAndPara {
	private int a;
	private int b;
	public BothDefAndPara()
	{
		a=0;
		b=0;
	}
	public BothDefAndPara(int x,int y)
	{
		a=x;
		b=y;
	}
	public void display()
	{
		System.out.println("a="+a+"\t b="+b);
	}

}
