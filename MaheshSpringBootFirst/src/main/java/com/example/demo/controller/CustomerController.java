package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/demo")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/checking")
	public String hello() {
		return "hello Teams";
	}
	
	@GetMapping("/findAll")
	public List<Customer> getAll(){
		System.err.println("method is loading");
		return service.getAll();
	}
	//mam code
//	@GetMapping("customer/{id}")
//	public ResponseEntity<?> getCustById(@PathVariable Integer id){
//		return status(200).body(service.getById(id));
//	}
	
	//mahesh code
	@GetMapping("customer/{id}")
	public Optional<Customer> getCustById(@PathVariable Integer id){
		return (service.getById(id));
	}
	
	//mam code
//	@PostMapping("/add")
//	public ResponseEntity<?> addUser(@RequestBody Customer customer){
//		return status(200).body(service.addCustomer(customer));
//	}
	
	//mahesh code
	@PostMapping("/add")
	public Customer addUser(@Valid @RequestBody Customer customer){
		return (service.addCustomer(customer));
	}
	
	//mahesh code
	@PutMapping("/update/{id}")
	public Customer update(@PathVariable("id") int id,@RequestBody Customer cust ) {
		return service.update(id,cust);
	}
	
	//mahesh code
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id,@RequestBody Customer cust ) {
		return service.delete(id,cust);
	}
	@GetMapping("/byname/{name}")
	public ResponseEntity<?> getCustByName(@PathVariable String name){
		return status(200).body(service.getByName(name));
	}
	
	@GetMapping("/bycountry/{country}")
	public ResponseEntity<?> getCustByCountry(@PathVariable String country){
		return status(200).body(service.getByCountry(country));
	}
	
	@GetMapping("/bynameandcountry/{name}/{country}")
	public ResponseEntity<?> getCustByNameAndCountry(@PathVariable String name,@PathVariable String country){
		return status(200).body(service.getByNameAndCountry(name,country));
	}
	
}
