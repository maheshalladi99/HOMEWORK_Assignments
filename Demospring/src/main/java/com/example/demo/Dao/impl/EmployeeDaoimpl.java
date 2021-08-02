package com.example.demo.Dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.model.Employee;
@Repository
public class EmployeeDaoimpl implements EmployeeDao {
	@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String q="insert into employee_table(employee_name,email,salary)values(?,?,?,?)";
		int update = jdbcTemplate.update(q,employee.getEmployeeName(),employee.getEmail(),employee.getSalary());
		if(update==1) {
			System.out.println("done");
		}
		else {
			System.out.println("not done ");
		}
	}

}
