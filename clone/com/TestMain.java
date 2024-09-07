package com.sritech.clone.com;

public class TestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test test=new Test(33,"PUSHPA");
		System.out.println(test);
		//Test test2=test;
		Object clone=test.clone();
		Test test2=(Test)clone;
		test2.setUserID(101);
		test2.setUserName("LATHA");
		//int userID = test2.getUserID();
		//String userName = test2.getUserName();
		System.out.println(test);
		//System.out.println(userID+"\t"+userName);
		System.out.println(test2);
	}

}
