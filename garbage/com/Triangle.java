package com.sritech.garbage.com;

public class Triangle implements Picture{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
	}
	public void finalize()
	{
		System.out.println("Triangle object destroyed");
	}

}
