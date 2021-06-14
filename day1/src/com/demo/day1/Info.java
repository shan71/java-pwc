package com.demo.day1;

public class Info {

	public void info() {
		System.out.println("Info not available..");
	}
	public String info(String msg) {
		return "Info : "+msg;
	}
	
	public String info(String msg, int year) {
		return "Info : "+msg+" in "+year;
	}
	
	public String info(String msg, double time) {
		return "Info : "+msg+" at "+time;
	}
	public static void main(String[] args) {
		
		Info i= new Info();
		
		i.info();
		System.out.println(i.info("Hello There.."));
		System.out.println(i.info("Hello There..",2021));
		System.out.println(i.info("Hello There..",7.5));

	}

}
