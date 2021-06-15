package com.demo.exceptions;

public class Person2 {

	public String filterByAge(int age) throws NotAdultException {
		String result = "";
		try {
			if (age < 18) {
				throw new NotAdultException();
			} else {
				result = "You are permitted as Adult";
			}
		} catch (NotAdultException e) {
			throw new RuntimeException("You are Not An Adult..");
		}
		return result;
	}
}
