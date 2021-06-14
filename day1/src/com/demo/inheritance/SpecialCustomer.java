package com.demo.inheritance;

public class SpecialCustomer extends Customer{
	
	protected boolean priviledged;

	public SpecialCustomer(int custId, String name, String city,boolean priviledged) {
		super(custId, name, city);
		this.priviledged=priviledged;
	}
	
	@Override
	public String getCustDetails() {
		
		return super.getCustDetails()+" : is priviledged "+priviledged;
	}
	
	@Override
	public String toString() {
		
		return "This is priviledged Customer class";
	}
	
}
