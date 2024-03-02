package com.karina.SequenceMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cus_gen")
	@SequenceGenerator(name="cus_gen",sequenceName="cus_seq", initialValue=5, allocationSize=100)
	int cusid;
	String cusname;
	String city;
	String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	Bike bike;

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

}
