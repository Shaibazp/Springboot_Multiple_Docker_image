package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller+responsebody
@RequestMapping("/emp")
public class empController 
{
	@PostMapping("/save")
	public String createEmp()
	{
		return "Emp-Save";
	}
	
	@GetMapping("/show")
	public String fetchEmp()
	{
		return "Get-Employee";
	}
	
	@PutMapping("/modify")
	public String ModifyEmp()
	{
		return "Modify-Employee";
	}
	
	@DeleteMapping("/remove")
	public String deleteEmp()
	{
		return "Delete-Employee";
	}
	
	@PatchMapping("/partial")
	public String partialEmp()
	{
		return "Partial-modify-Employee";
	}
	
	
}
