package com.example.Auto.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Auto.entity.Product;
import com.example.Auto.repositary.ProductRepo;


@Service
public class AdminServiceImp implements AdminService{
	
	@Autowired
	private ProductRepo productRepo;

	public Product addProduct(Product product) {
		return productRepo.save(product);
		
	}
	@Override
	public List<Product> getProduct(){
		return productRepo.findAll();
	}
	
	@Override
	public void deleteProduct(Long productId) {
		productRepo.deleteById(productId);
	
	}
}