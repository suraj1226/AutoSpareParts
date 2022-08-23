package com.example.Auto.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Auto.entity.CustomerInfo;
import com.example.Auto.userservice.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	@PostMapping("/addUser")
	public  CustomerInfo addUser(@RequestBody CustomerInfo customer) {
		
		return service.addUser(customer);
	}
	
	 
}





