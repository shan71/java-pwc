package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Mail mail=(Mail)ctx.getBean("myMail");
		
		System.out.println(mail.getMessage().getBody());
		
		Mail mail1=ctx.getBean(Mail.class);
		
		System.out.println(mail==mail1);

	}

}
