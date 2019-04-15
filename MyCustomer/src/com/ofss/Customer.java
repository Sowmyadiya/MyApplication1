package com.ofss;

public class Customer {
	
	String customerName;
	Address address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		String msg=this.customerName + " " + this.address ;
		return msg;
	}

}
