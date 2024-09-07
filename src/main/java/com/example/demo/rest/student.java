package com.example.demo.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class student 
{
	private int id;
	private String sname;
	private double sfee;
}
