package com.demo.hibernate.HiberOne;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="privateSt")
//@PrimaryKeyJoinColumn(name="id")
public class PrivateStudent extends Student{
	private float scholership;
	private String mobilenumber;
	public float getScholership() {
		return scholership;
	}
	public void setScholership(float scholership) {
		this.scholership = scholership;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public PrivateStudent(int id, String name, String city, float scholership, String mobilenumber) {
		super(id, name, city);
		this.scholership = scholership;
		this.mobilenumber = mobilenumber;
	}
	public PrivateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrivateStudent(int id, String name, String city) {
		super(id, name, city);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PrivateStudent [scholership=" + scholership + ", mobilenumber=" + mobilenumber + "]";
	}
	
}
