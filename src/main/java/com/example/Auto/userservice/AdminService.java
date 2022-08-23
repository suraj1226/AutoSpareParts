package com.example.Auto.userservice;

import java.util.List;


import com.example.Auto.entity.Product;


public interface AdminService {

	Product addProduct(Product product);

	List<Product> getProduct();

	void deleteProduct(Long productId);



}
