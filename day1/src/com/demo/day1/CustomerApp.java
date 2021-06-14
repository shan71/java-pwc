package com.demo.day1;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c1 = new Customer(100, "John");

		System.out.println(c1.getCustDetails());

		Customer c2 = new Customer(100, "John","Bangalore");

		System.out.println(c2.getCustDetails());

	}

}
