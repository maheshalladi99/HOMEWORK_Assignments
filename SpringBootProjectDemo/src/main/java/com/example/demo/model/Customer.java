package com.example.demo.model;

public class Customer {
	 private Integer custNo;
     private String custName;
     private String country;
	public Integer getCustNo() {
		return custNo;
	}
	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", country=" + country + "]";
	}
	public Customer(Integer custNo, String custName, String country) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.country = country;
	}

}
