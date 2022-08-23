package com.example.Auto.userservice;

import java.util.List;

import com.example.Auto.entity.CustomerInfo;
import com.example.Auto.entity.Product;


public interface Service1 {

	public CustomerInfo addUser(CustomerInfo customer);

	public List<CustomerInfo> getUser();

	public void deleteUser(Long userId);
	
	public Product addProduct(Product product) ;

	public List<Product> getProduct();
	
	public void deleteProduct(Long productId);



}
