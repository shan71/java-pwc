package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("shantanu","pavan","chandra","ranga","tirumala","chandra","amit");
		
		
		//nameList.stream().filter(s->s.contains("h")).forEach(t->System.out.println(t));
		//nameList.stream().filter(s->s.contains("h")).forEach(System.out::println);
		
		nameList.parallelStream().sorted((s1,s2)->s2.compareTo(s1)).forEach(s->System.out.println(s));
		
		System.out.println(nameList.parallelStream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList()));
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,7,89,54,21,34,56,81,32,54);
		
		//print all even numbers
		//nums.stream().filter(num->num%2==0).forEach(System.out::println);
		
		List<Integer> evenNums=nums.parallelStream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		//count all even numbers
		long result=nums.parallelStream().filter(num->num%2==0).count();
		System.out.println(result);
		//find the max even number
		int max=nums.parallelStream().filter(num->num%2==0).max((n1,n2)->n1.compareTo(n2)).get();
		System.out.println(max);
		//add all even numbers
		nums.parallelStream().filter(num->num%2==0).mapToInt(num->num.intValue()).sum();
		
		nums.stream().filter(num->num%2==0).mapToInt(num->num.intValue()+10).sum();
		
		//reduce
		int sum=nums.stream().filter(num->num%2==0).mapToInt(num->num.intValue()+10).reduce((num1,num2)->num1+num2).getAsInt();
		
		System.out.println(sum);
		
		//create a list of 5 strings and calculate the length of longest string
		
		System.out.println(nameList.stream().mapToInt(name->name.length()).max());
		
			


	}

}
