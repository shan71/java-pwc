package com.demo.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.demo.app.*")
public class TestMethods {

	@Test
	public void testStaticMethod() {
		PowerMockito.mockStatic(Util.class);
		
		PowerMockito.when(Util.callStatic()).thenReturn("static");
		
		assertEquals("static", Util.callStatic());
	}

	@Test
	public void testFinalMethod() throws Exception{
		Util util=PowerMockito.mock(Util.class);
		/*
		PowerMockito.whenNew(Util.class).withNoArguments().thenReturn(util);
		Util u=new Util();
		PowerMockito.verifyNew(Util.class).withNoArguments();
		*/
		PowerMockito.when(util.callFinal()).thenReturn("final");
		assertEquals("final", util.callFinal());
	}
	
	@Test
	public void testPrivateMethod() throws Exception{
		Util mock=PowerMockito.spy(new Util());
		
		PowerMockito.when(mock,"callPrivate").thenReturn("very Private");
		
		assertEquals("very Private", mock.callPrivateMethod());
	}
}
