package com.sritech.google;

public class Constructor {
	private int a;
	private int b;
	public Constructor()
	{
		a=0;
		b=0;
		System.out.println("defalut");
	}
	public Constructor(int x)
	{
		this();
		a=x;
		System.out.println("one parameters");
	}
	public Constructor(int x,int y)
	{
		this(x);
		a=x;
		b=y;
		System.out.println("two parameters");
		System.out.println(x+"\t"+y);
	}
	

}
