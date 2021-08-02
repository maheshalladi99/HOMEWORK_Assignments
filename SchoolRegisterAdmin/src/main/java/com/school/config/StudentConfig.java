package com.school.config;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@EnableWebMvc
@ComponentScan(basePackages = "com.school.*")
public class StudentConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

	DataSource datainfo() {
		DriverManagerDataSource datainfo = new DriverManagerDataSource();
		datainfo.setUsername("root");
		datainfo.setPassword("Mahesh@9966");
		datainfo.setUrl("jdbc:mysql://localhost:3306/sampleDB1");
		datainfo.setDriverClassName("com.mysql.cj.jdbc.Driver");
		System.out.println("database connected");
		return datainfo;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datainfo());
		return jdbcTemplate;

	}

}
