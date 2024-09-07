package com.sritech.constructors.com;

public class DataBaseHost {
	private String dbHost;
	private String dbName;
	private int dbPortNum;
	private String dbUserId;
    private String dbPassWord;
	public DataBaseHost()
	{
		dbHost="localhost";
		dbName="oracle";
		dbPortNum=1521;
		dbUserId="Pushpa";
		dbPassWord="Brave";
		
	}
	public String getDbHost() {
		return dbHost;
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public int getDbPortNum() {
		return dbPortNum;
	}
	public void setDbPortNum(int dbPortNum) {
		this.dbPortNum = dbPortNum;
	}
	public String getDbUserId() {
		return dbUserId;
	}
	public void setDbUserId(String dbUserId) {
		this.dbUserId = dbUserId;
	}
	public String getDbPassWord() {
		return dbPassWord;
	}
	public void setDbPassWord(String dbPassWord) {
		this.dbPassWord = dbPassWord;
	}
	
}	