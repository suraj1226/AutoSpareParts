package com.example.Auto.userservice;

import java.util.List;

import com.example.Auto.entity.CustomerInfo;


public interface UserService {

	public CustomerInfo addUser(CustomerInfo customer);

	public List<CustomerInfo> getUser();

	public void deleteUser(Long userId);
	

	



}
