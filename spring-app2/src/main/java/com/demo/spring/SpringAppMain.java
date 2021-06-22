package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmpService;

public class SpringAppMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		EmpService service=(EmpService)ctx.getBean("empService");
		
		System.out.println(service.registerEmp("Shantanu"));

	}

}
