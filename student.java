package com.autowiredAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class student {

	private int roll;
	private String name;
	
	//@Autowired
	private Address address;
	
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
}
