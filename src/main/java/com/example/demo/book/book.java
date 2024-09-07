package com.example.demo.book;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class book 
{
	private Integer bookId;
	private String bookName;
	private Double bookCost;
	
	private List<String> data;
	private Map<String, String> dlist;
}
