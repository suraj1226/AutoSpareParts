package com.example.Auto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Cart {
	
	@Id
	private long cartId;
	private int totalProducts;
	private long totalPrice;
}
