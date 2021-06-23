package com.demo.app;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMethods {

	@Mock
	Util util;
	
	@Test
	@Disabled
	public void testStaticMethod() {
		when(Util.callStatic()).thenReturn("static");
		Assertions.assertEquals("static",Util.callStatic());
	}
	
	@Test
	public void testFinalMethod() {
		when(util.callFinal()).thenReturn("final");
		Assertions.assertEquals("final",Util.callStatic());
	}
}
