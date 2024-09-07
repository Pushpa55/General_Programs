package com.sritech.constructors.com;

public class DataBaseHostMain {
	public static void main(String[] args) {
		DataBaseHost dataBaseHost=new DataBaseHost();
		System.out.println("Db server initial details");
		//String dbHost = dataBaseHost.getDbHost();
		System.out.println(dataBaseHost.getDbHost());
		System.out.println(dataBaseHost.getDbName());
		System.out.println(dataBaseHost.getDbPortNum());
		System.out.println(dataBaseHost.getDbUserId());
		System.out.println(dataBaseHost.getDbPassWord());
		//Changing data base server details
		dataBaseHost.setDbHost("192.168.56.101");
	    dataBaseHost.setDbName("prod");
		dataBaseHost.setDbPortNum(1521);
		dataBaseHost.setDbUserId("Latha");
		dataBaseHost.setDbPassWord("Princess");
		System.out.println("After changing data base details");
		System.out.println(dataBaseHost.getDbHost());
		System.out.println(dataBaseHost.getDbName());
		System.out.println(dataBaseHost.getDbPortNum());
		System.out.println(dataBaseHost.getDbUserId());
		System.out.println(dataBaseHost.getDbPassWord());
		
	}

}
