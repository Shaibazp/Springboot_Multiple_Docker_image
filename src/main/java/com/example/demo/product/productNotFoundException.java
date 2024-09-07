package com.example.demo.product;

public class productNotFoundException extends RuntimeException 
{
	public productNotFoundException()
	{
		
	}
	
	public productNotFoundException(String msg)
	{
		super(msg);
	}
}
