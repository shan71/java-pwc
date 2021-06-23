package com.demo.app;

import java.util.Arrays;
import java.util.List;

public class Util implements DemoInterface {

	List<String> entries;

	public Util() {
		entries = Arrays.asList("scott", "tiger", "john", "mary", "sheila", "romel");
	}

	@Override
	public String findName(int index) {
		if (index <= entries.size() - 1) {
			System.out.println("Name Returned..");
			return entries.get(index);
		} else {
			throw new RuntimeException("Index does not exist");
		}
	}
	
	public static String callStatic() {
		return "static";
	}
	
	private  String callPrivate() {
		return "private";
	}
	
	public final String callFinal() {
		return "final";
	}

}
