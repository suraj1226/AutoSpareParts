package com.example.Auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Auto.entity.Product;
import com.example.Auto.userservice.AdminService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService; 
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return adminService.addProduct(product);
		
	}
	@GetMapping("/getProduct")
	public List<Product> getProduct(){
		
		return adminService.getProduct();
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteproducct(@PathVariable("id") Long productId) {
		
		adminService.deleteProduct(productId);
		return "Product Deleted";
	}
	
    

}
