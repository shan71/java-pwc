package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("shantanu","pavan","chandra","ranga","tirumala","chandra","amit");
		
		
		nameList.stream().filter(name->name.length()>6).forEach(System.out::println);
		
		//add welcome before the names which are more than 6 chars long
		
		List<String> filteredList=nameList .stream()
		.filter(name->name.length()>6)
		.map(name->"Welcome to Streams "+name)
		.collect(Collectors.toList());
		
		System.out.println(filteredList.size());
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,7,89,54,21,34,56,81,32,54);
		
		
		//create a list of 5 strings and calculate the length of longest string
		
		
		System.out.println(nums.stream().mapToInt(n->n.intValue()).max().getAsInt());
		
			


	}

}
