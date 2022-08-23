package com.example.Auto.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Auto.entity.CustomerInfo;
import com.example.Auto.repositary.UserRepo;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepo repo;
	
	
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
	
	
}

	

