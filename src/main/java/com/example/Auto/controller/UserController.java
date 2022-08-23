package com.example.Auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Auto.entity.CustomerInfo;
import com.example.Auto.userservice.Service1;



@RestController
public class UserController {
	
	@Autowired
	private Service1 service;
	@PostMapping("/addUser")
	public  CustomerInfo addUser(@RequestBody CustomerInfo customer) {
		
		return service.addUser(customer);
	}
	
	@GetMapping("/getUser")
	public List<CustomerInfo> getUser(){
		
		return service.getUser();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Long userId) {
		
		service.deleteUser(userId);
		return "User Deleted";
	}
	 
}





