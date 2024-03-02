package com.karina.SequenceMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeRepository brepo;
	CustomerRepository crepo;
	
	@RequestMapping("/test")
	public String test()
	{
		
		return"program tested";
	}
	@RequestMapping("/save")
	public String save()
	{
		Bike b=new Bike();
		b.setBikename("Honda");
		b.setPrice(75000);
		
		Customer c=new Customer();
		c.setCusname("Jayant");
		c.setCity("Hazaribag");
		c.setEmail("abc@gmail.com");
		
		c.setBike(b);
		b.setCustomer(c);
		brepo.save(b);
		return"data saved";
	}
	@RequestMapping("/all")
	public List<Bike> all()
	{
		return brepo.findAll();
	}
	
}
