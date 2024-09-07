package com.example.demo.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.entity.errorMessage;
import com.example.demo.product.productNotFoundException;

@RestControllerAdvice
public class customeExceptionHandler 
{
	@ExceptionHandler(productNotFoundException.class)
	public ResponseEntity<errorMessage> handleProductNotFound(productNotFoundException e)
	{
		return new ResponseEntity<errorMessage>(
				new errorMessage(e.getMessage(),"Product", new Date().toString(), "Data Not Found"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
