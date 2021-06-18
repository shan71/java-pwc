package com.demo.json;

import com.google.gson.Gson;

public class GSonMain {

	public static void main(String[] args) {
	
		Emp emp= new Emp(100, "Shantanu", "Hyderabad", 35000);
		
		Gson gson= new Gson();
		String empJson=gson.toJson(emp);
		System.out.println(empJson);
		
		
		String empJson2="{\"empId\":100,\"name\":\"Shantanu\",\"city\":\"Hyderabad\",\"salary\":35000.0}";
		
		Emp emp2=gson.fromJson(empJson2, Emp.class);
		
		System.out.println(emp2);

	}

}
