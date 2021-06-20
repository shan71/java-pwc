package com.demo.exceptions;

public class Person {

	public String filterByAge(int age) {
		String result = "";
		try {
			if (age < 18) {
				throw new ArithmeticException("You are not an Adult: Permission Denied");
			} else {
				result = "You are permitted as Adult";
			}
		} catch (ArithmeticException e) {
			throw new RuntimeException(e.getMessage());
		}
		return result;
	}
}
