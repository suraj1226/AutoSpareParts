package com.example.Auto.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Auto.entity.Cart;

public interface cartRepo extends JpaRepository<Cart,Long>{

}
