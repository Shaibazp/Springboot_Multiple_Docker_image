package com.example.demo.rest;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam 
{
	private String subName;
	private String result;
	private Integer marks;
}
