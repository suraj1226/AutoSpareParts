package com.example.Auto.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Auto.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{

}
