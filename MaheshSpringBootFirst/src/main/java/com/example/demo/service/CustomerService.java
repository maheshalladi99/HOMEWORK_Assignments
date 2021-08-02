package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> getAll(){
		//List<Customer> customer = repo.findAll();
		
		//System.out.println(customer);
		return repo.findAll();
		
	}
	public Optional<Customer> getById(Integer id){
		 return repo.findById(id);
	 }

	public Customer addCustomer(Customer customer) {
		  return repo.save(customer);
	  }
	 public Customer update(@PathVariable("id") int id,@RequestBody Customer cust) {
		 	cust.setCustNo(id);
		 	System.out.println("Up dated sucessfully");
			return repo.save(cust);
		}
//mahesh cose
	public String delete(int id, Customer cust) {
		cust.setCustNo(id);
		repo.delete(cust);
		return "deleted sucusfully";
	}
	
	
	public List<Customer> getByName(String name) {
		// TODO Auto-generated method stub
		 return repo.findByCustName(name);
	}
	public List<Customer> getByCountry(String country) {
		// TODO Auto-generated method stub
		 return repo.findByCountry(country);
	}
	public List<Customer> getByNameAndCountry(String name, String country) {
		// TODO Auto-generated method stub
		 return repo.findByCustNameAndCountry(name,country);
	}
	

}

//public String delete(int id, Customer cust) {
//		cust.setCustNo(id);
//		repo.delete(cust);
//		return "deleted sucusfully";
//	}
