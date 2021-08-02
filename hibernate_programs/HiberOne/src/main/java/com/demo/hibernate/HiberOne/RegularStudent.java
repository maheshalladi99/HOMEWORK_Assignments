package com.demo.hibernate.HiberOne;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//for seperate table
@Table(name="regularSt")
//@AttributeOverrides({@AttributeOverride(name="id",column=@Column(name="id")),
//	@AttributeOverride(name="name",column=@Column(name="name"))
//	})
@PrimaryKeyJoinColumn(name="id")
public class RegularStudent extends Student{

	private float fee;
	private String address;
	
	
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public RegularStudent(int id, String name, String city, float fee, String address) {
		super(id, name, city);
		this.fee = fee;
		this.address = address;
	}
	public RegularStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegularStudent(int id, String name, String city) {
		super(id, name, city);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegularStudent [fee=" + fee + ", address=" + address + "]";
	}
	
}
