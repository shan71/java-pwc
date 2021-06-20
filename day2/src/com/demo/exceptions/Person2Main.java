package com.demo.exceptions;

public class Person2Main {

	public static void main(String[] args) {
		try {
			Person2 p1 = new Person2();
			String result = p1.filterByAge(17);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Execution ends here...");

	}

}
