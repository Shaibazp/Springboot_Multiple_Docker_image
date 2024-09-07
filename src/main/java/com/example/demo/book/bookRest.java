package com.example.demo.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class bookRest 
{
	@PostMapping("/save")
	public String createbook(@RequestBody book book)
	{
		return book.toString();
	}
	
	@GetMapping("/fetch/{code}")
	public String getProduct(@PathVariable String code)
	{
		return code;
	}
}
