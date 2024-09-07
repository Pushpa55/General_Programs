package com.sritech.garbage.com;

public class PictureMain {
	
	public static void main(String[] args) {
		
		Picture p=new Rectangle();
		p.draw();
		
		p=new Triangle();
		p.draw();
		
		p=new Circle();
		p.draw();
		
		System.gc();
	}

}
