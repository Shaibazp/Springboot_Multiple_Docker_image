package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.product;
import com.example.demo.product.productNotFoundException;
import com.example.demo.repository.productRepository;
import com.example.demo.service.productService;

@Service
public class productserviceImpl implements productService {

	@Autowired
	private productRepository repo;
	
	@Override
	public Integer saveProduct(product product) {
		return repo.save(product).getProdID();
	}

	@Override
	public product findProduct(Integer id) {
//		Optional<product> prod = repo.findById(id);
//		if(prod.isPresent())
//		{
//			return prod.get();
//		}
//		else
//		{
//			 throw new productNotFoundException("Not Found Exception.....!");
//		}
		return repo.findById(id).orElseThrow(()-> new productNotFoundException("Not Found.....! : "+id));
	}

	@Override
	public List<product> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.delete(findProduct(id));

	}

	@Override
	public void updateProduct(product p) {
		if(p.getProdID()==null || !repo.existsById(p.getProdID()))
		{
			throw new productNotFoundException("Not Found.....! : "+p.getProdID());
		}
		else
		{
			repo.save(p);
		}

	}
	
	@Transactional
	public void modifyCodebyID(String code, Integer id)
	{
		if(!repo.existsById(id))
		{
			throw new productNotFoundException("Not Found.....! : "+id);
		}
		else
		{
			repo.modifyByProdID(code, id);
		}
	}

}
