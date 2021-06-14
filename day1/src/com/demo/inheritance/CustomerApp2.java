package com.demo.inheritance;

public class CustomerApp2 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(100, "John","Bangalore");

		System.out.println(c1.getCustDetails());
		
		SpecialCustomer c2=new SpecialCustomer(102, "Venky", "Hyderabad", true);
		
		System.out.println(c2.getCustDetails());
		
		
		Customer c3= c2; //Superclass reference to subclass Object
		
		System.out.println(c3.getCustDetails());
		

	}

}
