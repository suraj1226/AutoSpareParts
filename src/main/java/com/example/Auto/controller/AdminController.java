package com.example.Auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Auto.entity.Product;
import com.example.Auto.userservice.Service1;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private Service1 productService; 
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
		
	}
	@GetMapping("/getProduct")
	public List<Product> getProduct(){
		
		return productService.getProduct();
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteUser(@PathVariable("id") Long productId) {
		
		productService.deleteUser(productId);
		return "Product Deleted";
	}
	
    

}
