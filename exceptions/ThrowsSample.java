package com.sritech.exceptions;

public class ThrowsSample extends Exception{
	private String message;
	
	public ThrowsSample()
	{
		message=null;
	}
	public ThrowsSample(String message )
	{
		this.message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
