package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prodID;
	private String prodCode;
	private Double prodCost;
	private String prodVendor;
}
