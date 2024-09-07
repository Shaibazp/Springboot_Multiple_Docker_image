package com.example.demo.product;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.product;
import com.example.demo.service.productService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/prod")
@Slf4j
@Api("PRODUCT API")
public class productRest 
{
	private static final Logger log = LoggerFactory.getLogger(productRest.class);
	@Autowired
	private productService service;
	
	@PostMapping("save")
	public ResponseEntity<?> saveProduct(@RequestBody product product)
	{
		log.info("Entered Into Operation");
		ResponseEntity<?> resp = null;
		try 
		{
			resp = new ResponseEntity<>("Product Added : "+service.saveProduct(product), HttpStatus.CREATED);
			log.debug("Product Is Created ");
		}
		catch (Exception e) 
		{
			log.error("Unable to performed Save Operation");
			throw e;
		}
		log.info("Return to response");
		return resp;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<?> findAllProduct()
	{
		ResponseEntity<?> resp = null;
		try 
		{
			resp = new ResponseEntity<List<product>>(service.findAll(), HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return resp;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findbyidProduct(@PathVariable Integer id)
	{
		ResponseEntity<?> resp = null;
		try 
		{
			resp = new ResponseEntity<product>(service.findProduct(id), HttpStatus.OK);
		} 
		catch (productNotFoundException e) 
		{
			log.error("NOT FOUND.....");
			resp = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return resp;
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeProduct(@PathVariable Integer id)
	{
		ResponseEntity<?> resp = null;
		try 
		{
			service.deleteProduct(id);
			resp = new ResponseEntity<String>(id+" Deleted.....", HttpStatus.OK);
		} 
		catch (productNotFoundException e) 
		{
//			resp = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			throw e;
		}
		return resp;
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateProduct(@RequestBody product p)
	{
		ResponseEntity<?> resp = null;
		try 
		{
			service.updateProduct(p);
			resp = new ResponseEntity<>("Product Updated.....!", HttpStatus.OK);
		}
		catch (Exception e) 
		{
			throw e;
		}
		return resp;
	}
	
	@PatchMapping("/modify/{id}/{code}")
	public ResponseEntity<?> modifyProduct(@PathVariable Integer id, @PathVariable String code)
	{
		ResponseEntity<?> resp = null;
		try 
		{
			service.modifyCodebyID(code, id);
			resp = new ResponseEntity<>("Product Updated.....!", HttpStatus.OK);
		}
		catch (Exception e) 
		{
			throw e;
		}
		return resp;
	}
	
}
