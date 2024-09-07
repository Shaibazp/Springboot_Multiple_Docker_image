package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stud")
public class studentRestController 
{
	@GetMapping("/find")
	public student findOneStudent()
	{
		return new student(101, "AA", 200.2);
	}
	
	@GetMapping("/all")
	public List<student> findAllStudent()
	{
		return Arrays.asList(
				new student(101, "AA", 200.2),
				new student(101, "AA", 200.2),
				new student(101, "AA", 200.2),
				new student(101, "AA", 200.2));
	}
	
	@GetMapping("/result")
	public examResult getResult()
	{
		return new examResult(101, "PASS", Arrays.asList(
														new Exam("Math","PASS", 95),
														new Exam("Math","PASS", 95),
														new Exam("Math","PASS", 95),
														new Exam("Math","PASS", 95),
														new Exam("Math","PASS", 95)), 
				"A", new student(101, "AA", 200.2));
	}
	
	@GetMapping("/info")
	public Map<String,  student> getdetails()
	{
		return Map.of("SA-004",new student(101, "AA", 200.2),
				"SA-001",new student(101, "AA", 200.2),
				"SA-002",new student(101, "AA", 200.2),
				"SA-003",new student(101, "AA", 200.2)); 
	}
}
