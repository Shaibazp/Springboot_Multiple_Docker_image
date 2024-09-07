package com.example.demo.exception;

public class productNotFoundException extends RuntimeException
{
	public productNotFoundException() {
		super();
	}
	
	public productNotFoundException(String msg)
	{
		super(msg);
	}
}
