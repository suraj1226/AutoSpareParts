package com.example.Auto.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Auto.entity.CustomerInfo;
import com.example.Auto.entity.Product;
import com.example.Auto.repositary.ProductRepo;
import com.example.Auto.repositary.UserRepo;

@Service
public class ServiceImp implements Service1 {
	
	@Autowired
	private UserRepo repo;
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public CustomerInfo addUser(CustomerInfo customer) {
		return repo.save(customer) ;
	}
	
	@Override
	public List<CustomerInfo> getUser(){
		return repo.findAll();
	}
	
	@Override
	public void deleteUser(Long userId) {
		repo.deleteById(userId);
		
	}
	
	@Override
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
