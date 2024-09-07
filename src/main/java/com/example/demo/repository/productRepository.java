package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.product;

public interface productRepository extends JpaRepository<product, Integer> 
{
	@Modifying
	@Query(value = "update product set prod_code=:code where prodid=:id", nativeQuery = true)
	void modifyByProdID(String code, Integer id);
}
