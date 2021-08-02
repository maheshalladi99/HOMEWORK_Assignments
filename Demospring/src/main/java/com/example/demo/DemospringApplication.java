package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Dao.impl.EmployeeDaoimpl;
import com.example.demo.model.Employee;

@SpringBootApplication
public class DemospringApplication implements CommandLineRunner{
	@Autowired
private EmployeeDao employeeDao;	
	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createEmployee();
		
	}

	private void createEmployee() {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setEmployeeName("mahesh babu");
		emp.setEmail("mb@gmail.com");
		emp.setSalary(1000000.11);
		employeeDao.createEmployee(emp);
	}

}
