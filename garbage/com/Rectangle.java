package com.sritech.garbage.com;

public class Rectangle implements Picture{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	public void finalize() throws Throwable{
		System.out.println("Rectangle object destroyed");
	}
	{
		
	}

}
