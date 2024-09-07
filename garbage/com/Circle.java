package com.sritech.garbage.com;

public class Circle implements Picture{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	public void finalize()
	{
		System.out.println("Circle object destroyed");
	}

}
