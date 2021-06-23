package com.demo.spring.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.demo.spring.AppConfig;
import com.demo.spring.service.EmpService;

@SpringJUnitConfig(AppConfig.class)
public class SpringAppTest {

	@Autowired
	EmpService service;
	
	@Test
	public void testRegisterEmp() {
		Assertions.assertNotNull(service.registerEmp("shantanu"));
	}
	
}
