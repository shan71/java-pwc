package com.demo.app;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTests {

	List mockedList = mock(List.class);
	
	@Mock
	Math m ;//= mock(Math.class);
	
	@Mock
	DemoInterface d;//= mock(DemoInterface.class);
	
	@Spy
	Util d2;
		
	@Test
	public void testAdd() {
		
		when(m.add(2, 4)).thenReturn(6);
		Assertions.assertEquals(6, m.add(2, 4));
		
		
	}
	
	@Test
	public void testFindName() {
		when(d.findName(3)).thenReturn("mary");
		Assertions.assertEquals("mary", d.findName(3));
	}
	
	@Test
	public void testSpiedFindName() {
		when(d2.findName(1)).thenReturn("tiger");
		Assertions.assertEquals("tiger", d2.findName(1));
	}
	
	// using mock object - it does not throw any "unexpected interaction" exception
	@Test
	@Disabled
	public void testMocks() {
		System.out.println(mockedList.getClass().getName());
		mockedList.add("one");
		mockedList.clear();
		mockedList.remove(0);

		// selective, explicit, highly readable verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
		verify(mockedList).remove(0);
	}

}
