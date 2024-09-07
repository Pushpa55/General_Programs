package com.sritech.constructors.com;

public class Test {
	public static void main(String[] args) {
		//Sample s=new Sample();// compile time error as compiler not generating 
		                       //  any default constructor.
		

		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.display();
		s2.display();
		
	}

}
