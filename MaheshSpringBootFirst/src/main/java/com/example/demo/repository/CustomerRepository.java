package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{


	List<Customer> findByCountry(String country);


	List<Customer> findByCustNameAndCountry(String name, String country);


	List<Customer> findByCustName(String name);

}
