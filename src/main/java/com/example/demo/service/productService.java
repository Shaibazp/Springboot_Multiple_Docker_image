package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.product;

public interface productService 
{
	Integer saveProduct(product product);
	product findProduct(Integer id);
	List<product> findAll();
	void deleteProduct(Integer id);
	void updateProduct(product p);
	void modifyCodebyID(String code, Integer id);
}
