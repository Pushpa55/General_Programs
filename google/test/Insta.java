package com.sritech.google.test;

public class Insta {
	
	int id;
	
	String name;
	
	public Insta(int id, String name) 
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id+"\t"+name);
	}
	public static void main(String[] args) 
	{
		
		Insta i=new Insta(10,"pushpa");
		
		i.display();
		
		//System.out.println(i.id);
		
		//System.out.println(i.name);
	}

}
