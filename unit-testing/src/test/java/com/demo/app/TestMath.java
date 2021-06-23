package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestMath {

	public TestMath() {
		System.out.println("TestMath instantiated..");
	}
	Math m;
	
	//@BeforeAll
	//@BeforeEach
	public void setUp() {
	 Math m = new Math();
	}
	
	//@AfterAll
	//@AfterEach
	public void tearDown() {
		m=null;
		System.out.println("Tear down executed..");
	}
	// @Test
	@RepeatedTest(value = 4)
	public void testNothing() {
		System.out.println("This is a sample method..");
	}

	@Test
	public void testAdd() {
		
		assertEquals(6, m.add(4, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(8, m.multiply(4, 2));
	}
}
