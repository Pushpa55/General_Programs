package com.sritech.exceptions;

public class SampleException extends Exception{
	private String message;
	public SampleException()
	{
		message=null;
	}
	public SampleException(String message)
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
