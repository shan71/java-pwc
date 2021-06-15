package com.demo.exceptions;

public class ExceptionsDemo1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double result = a / b;
			int[] nums = new int[3];
			System.out.println(nums[2]);
			String[] names = new String[10];
			System.out.println(names[1].length());
			System.out.println("NO Exceptions here..");
		} catch (ArithmeticException e) {

			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index not available");
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally:Resources Released...");
		}

		System.out.println("Normal execution resumed....");

	}

}
