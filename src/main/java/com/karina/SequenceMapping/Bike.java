package com.karina.SequenceMapping;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bike_gen")
	@SequenceGenerator(name="bike_gen",sequenceName="bike_seq", initialValue=5, allocationSize=100)
	int bikeid;
	String bikename;
	int price;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	Customer customer;

	public int getBikeid() {
		return bikeid;
	}

	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
