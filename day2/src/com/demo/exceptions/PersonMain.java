package com.demo.exceptions;

public class PersonMain {

	public static void main(String[] args) {
		try {
			Person p1 = new Person();
			String result = p1.filterByAge(17);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Execution ends here...");

	}

}
