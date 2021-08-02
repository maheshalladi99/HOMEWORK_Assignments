package com.school.student;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.school.validations.fnamelen;
import com.school.validations.namevalid;
import com.school.validations.city;
import com.school.validations.lname;

public class Student {
	private int id;
	//@NotEmpty(message="should not be empty")
	@namevalid(message="should have ha ")
	//@fnamelen(message="should have minimum 8 or max 20 ")
	private String fname;
	@lname
	private String lname;
	//@Min(value=21,message="age must be greater or equal to 21")
	//@Max(value=60,message="age must be lesser or equal to 60")
	private int age;
	//@city(message="all should be capital")
	private String city;

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
