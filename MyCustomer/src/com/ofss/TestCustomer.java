package com.ofss;

public class TestCustomer {
	
	public static void main(String[] args)
	{
		//create  address object
		Address a1=new Address(112,"MG Road","bangalore",332);
				
	   //create customer object
	   Customer c1 = new Customer("Guru",a1);
	   
	   System.out.println(c1);
	   
	}

}
