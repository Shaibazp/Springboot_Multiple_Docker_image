package com.example.demo.rest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class examResult 
{
	private Integer id;
	private String result;
	private List<Exam> data;
	private String grade;
	private student student;
}
