package com.demo.day1;

public class Customer {
	static final String customerAppversion = "2.0";
	private int custId;
	private String name;
	private String city;

	public Customer(int custId, String name) {
		this.custId = custId;
		this.name = name;
	}

	public Customer(int custId, String name, String city) {
		this(custId, name);
		this.city = city;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static String getCustomerappversion() {
		return customerAppversion;
	}

	public String getCustDetails() {
		if (this.city != null) {
			return custId + " " + name + " " + city;
		} else {
			return custId + " " + name;
		}
	}

}
