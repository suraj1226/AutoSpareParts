package com.example.Auto.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class CustomerAddress {
	
	private String houseNo;
	private String landmark;
	private String street;
	private String district;
	private String pincode;
	

}
