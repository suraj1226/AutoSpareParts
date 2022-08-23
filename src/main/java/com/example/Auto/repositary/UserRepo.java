package com.example.Auto.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Auto.entity.CustomerInfo;


@Repository
public interface UserRepo extends JpaRepository<CustomerInfo, Long>{

}
