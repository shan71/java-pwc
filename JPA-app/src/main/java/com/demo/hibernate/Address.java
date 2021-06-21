package com.demo.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private String doorNo;
	

	private int pinCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String doorNo, int pinCode) {
		this.doorNo = doorNo;
		this.pinCode = pinCode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
